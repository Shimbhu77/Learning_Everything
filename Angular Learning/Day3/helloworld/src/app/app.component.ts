import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';



@Component({
  selector:'app-user',
  standalone:true,
  template:'Username : {{name}}',
  styles:`:host{ 
    color:blue;
  }`
})

export class UserComponent{
  name = "Shimbhu";
}



@Component({
  selector: 'app-root',
  standalone: true,
  template:`<app-user>`,
  imports:[UserComponent],
})
export class AppComponent {}
