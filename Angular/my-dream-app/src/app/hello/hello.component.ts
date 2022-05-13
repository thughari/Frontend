import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  //properties
  serverID:number=10;
  serverStatus:string='OnLine';
  mainServer:boolean=true;

  name:string='James Gosling';
  age:number=23;
  salary:number=5000;
 
  firstName:string='Hari';
  lastName:string='T';

  imagePath:string="https://akm-img-a-in.tosshub.com/indiatoday/images/story/201307/wipro_660_071913035442.jpg";

  constructor() { }

  ngOnInit(): void {
  }

  getFullName():string{
    return this.firstName+' '+this.lastName;
  }
 
  convertToDate(){
    const date = new Date();
    return date.toLocaleDateString();
  }

}
