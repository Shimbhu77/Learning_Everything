import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ChildComponent } from './app.child';
import { NgForChildComponent } from './app.ngfor';
import { NgSwitchComponent } from './app.ngswithc';

@Component({
  selector: 'app-root',
  standalone: true,

  template:`<app-child></app-child>
  <hr>
  <app-ngfor></app-ngfor>
  <hr>
  <app-ngswitch></app-ngswitch>
  `,
  imports: [ChildComponent,NgForChildComponent,NgSwitchComponent],
})
export class AppComponent {
  title = 'steps-directives';
}
