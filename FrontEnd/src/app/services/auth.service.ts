import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const AUTH_API = 'http://localhost:8181/';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpClient) { }

  login(email:string, password:string):Observable<any>{
    return this.http.post(AUTH_API + 'api/usuario',{
      email,
      password
    }, httpOptions);
  }

  register(username:string,email:string,password:string):Observable<any>{
    return this.http.post(AUTH_API + 'api/usuario',{
      username,
      email,
      password,

    }, httpOptions);

  }

  añadirHotel(nombre_hotel:string,precio_reserva:BigInteger,puntos_hoteles:BigInteger, img_hotel:string):Observable<any>{
    return this.http.post(AUTH_API + 'api/hoteles',{
      nombre_hotel,
      precio_reserva,
      puntos_hoteles,
      img_hotel,
    }, httpOptions);
  }

  eliminarHotel(id_hotel: string):Observable<any>{
    return this.http.delete(AUTH_API + 'api/hoteles/'+ id_hotel,)

  }

}
