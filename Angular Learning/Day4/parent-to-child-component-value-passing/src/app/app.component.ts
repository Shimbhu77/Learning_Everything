import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ParentComponent } from './app.parent';
import { ChildComponent } from './app.child';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ParentComponent],
  template:`<div style="border: 10px solid green;">
    <h1 style="text-align: center;">App Component</h1>
    <h2 style="text-align: center;">{{title}}</h2>
    <parent-comp></parent-comp>
  </div>`
})
export class AppComponent {
  title = 'parent-to-child-component-value-passing';
}
