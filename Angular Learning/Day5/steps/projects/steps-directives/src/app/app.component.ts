import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ChildComponent } from './app.child';

@Component({
  selector: 'app-root',
  standalone: true,

  template:`<app-child></app-child>`,
  imports: [ChildComponent],
})
export class AppComponent {
  title = 'steps-directives';
}
