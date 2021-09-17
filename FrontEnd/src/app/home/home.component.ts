import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../services/user.service';
import { Hotel } from '../models/hotel.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {


  articulos:any = null
  articul: Hotel = {};
  title = '';
  currentIndex = -1;
  arrayArticulos:Array<any> = new Array();
  arrayHoteles:Array<any> = new Array();

  constructor(private http:HttpClient, private userService: UserService) { }

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


  setActiveBook(hotel: Hotel, index:number):void{
    this.articul =hotel;
    this.currentIndex = index;
  }

  searchHotel():void{
    this.currentIndex = -1
    this.articul = {}
    this.userService.findByTitle(this.title)
      .subscribe(
        data => {
          this.articulos = data;

        },
        error => {
          console.log("Error 2")
        }
      )
  }



}
