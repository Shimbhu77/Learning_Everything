import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,

  template:`
  @if (showTitle) {
    <div>Title : {{title}}</div>
  }
  @else {
    <div>Name : {{name}}</div>
  }
  `
})
export class AppComponent {
  showTitle = false;
  title = 'angular-control-flow';
  name = "Shimbhu";
}
