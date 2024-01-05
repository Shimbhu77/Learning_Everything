import { CommonModule } from "@angular/common";
import { Component } from "@angular/core";

@Component({
 
    standalone:true,
    selector:'app-ngclass',
    template:`<h1 [ngClass]="isSpecial ? 'special' : '' ">ng class</h1>`,
    imports:[CommonModule],
    styles:[`
      .special{
        color:'green';
        border:4px solid red;
        background-color:
      }

    `]
})

export class NgClassComponent{
  isSpecial = true;
}