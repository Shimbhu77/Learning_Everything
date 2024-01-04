import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ChildComponent } from './app.child';
import { NgForChildComponent } from './app.ngfor';

@Component({
  selector: 'app-root',
  standalone: true,

  template:`<app-child></app-child>
  <hr>
  <app-ngfor></app-ngfor>
  `,
  imports: [ChildComponent,NgForChildComponent],
})
export class AppComponent {
  title = 'steps-directives';
}
