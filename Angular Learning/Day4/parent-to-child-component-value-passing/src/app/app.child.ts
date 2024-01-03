import { Component } from "@angular/core";

@Component({

     selector:'child-comp',
     standalone:true,
     template:`<div style="border: 4px solid red;">
        <h1 style="text-align: center;">It is Child Component</h1>
     </div>`

})

export class ChildComponent
{
  
}