import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { NgClassComponent } from './app.ngclass';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [NgClassComponent],
  template:`<h1>App Component</h1>
    <app-ngclass> </app-ngclass>
  `
  // templateUrl: './app.component.html',
  // styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'steps-pipes';
}
