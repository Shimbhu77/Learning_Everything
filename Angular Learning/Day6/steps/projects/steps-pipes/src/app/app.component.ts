import { Component } from '@angular/core';
import { CommonModule, DatePipe } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { NgClassComponent } from './app.ngclass';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [DatePipe],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = "steps-pipes";
  birthday = new Date(2002,4,14);
}
