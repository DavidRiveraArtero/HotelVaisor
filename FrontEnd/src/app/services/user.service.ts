import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL = 'http://localhost:4200/api/'
const API_URL2 = 'http://localhost:4200/api/hoteles'
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  getPublicContent(): Observable<any>{
    return this.http.get(API_URL + 'hoteles', {responseType: 'text'});
  }

  getUserBoard(): Observable<any>{
    return this.http.get(API_URL + 'user', {responseType: 'text'});
  }

  getModeratorBoard(): Observable<any>{
    return this.http.get(API_URL + 'mod', {responseType: 'text'});
  }

  getAdminBoard():Observable<any>{
    return this.http.get(API_URL + 'admin', {responseType: 'text'});
  }

  findByTitle(title:any): Observable<any>{
    return this.http.get(`${API_URL2}?nombre_hotel=${title}`);
  }
}
