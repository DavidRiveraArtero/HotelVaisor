import { Component, OnInit } from '@angular/core';
import { AuthService } from '../services/auth.service';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-board-user',
  templateUrl: './board-user.component.html',
  styleUrls: ['./board-user.component.css']
})
export class BoardUserComponent implements OnInit {

  form:any = {
    id_hotel:null,
    nombre_hotel:null,
    precio_reserva:null,
    puntos_hoteles:null,
    img_hotel:null
  }
  articulos:any = null
  arrayArticulos:Array<any> = new Array();
  arrayHoteles:Array<any> = new Array();

  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';

  constructor(private authService:AuthService, private http:HttpClient) { }

  ngOnInit(): void {
    this.http.get("http://localhost:8181/api/hoteles")
    .subscribe(
      result => {
        this.articulos = result
        console.log(result)

      },
      error =>{
        console.log('problemas')
      }
    )
  }

  //AÑADIR HOTELES
  onSubmit():void{
    const {nombre_hotel, precio_reserva,puntos_hoteles, img_hotel } = this.form;

    this.authService.añadirHotel(nombre_hotel,precio_reserva,puntos_hoteles,img_hotel).subscribe(
      data =>{
        console.log(data);
        this.isSuccessful = true
        this.isSignUpFailed = false
      },
      err =>{
        this.errorMessage = err.error.message
        this.isSignUpFailed = true
      }
    )
      console.log("hola")
  }

  delete():void{
    const {id_hotel} = this.form
    console.log(id_hotel)
    this.authService.eliminarHotel(id_hotel).subscribe(
      data =>{
        console.log(data)
      },
      err =>{
        this.errorMessage = err.error.message
      }
    )
  }
}
