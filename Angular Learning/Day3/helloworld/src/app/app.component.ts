import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  template:`Hello {{name}}!`,
  styles:`
  :host{
    color:purple;
  }
  `
})
export class AppComponent {
  name = "Shimbhu";
}
