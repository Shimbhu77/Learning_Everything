import { Component, Input } from "@angular/core";

@Component({

     selector:'child-comp',
     standalone:true,
     template:`<div style="border: 4px solid red;">
        <h1 style="text-align: center;">It is Child Component</h1>
        <h3 style="text-align: center;">message : {{message}}</h3>
     </div>`

})

export class ChildComponent
{
  @Input() message!:string;
}