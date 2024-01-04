import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ChildComponent } from './app.child';

@Component({
  selector: 'app-root',
  standalone: true,
  imports:[ChildComponent],
  template:`
  <div style="border: 10px solid purple;">
    <h1 style="text-align: center;">Parent Component</h1>
    <child-comp (dataToParent) = "receivedDataFromChild($event)"></child-comp>
    <h1>This Value Show When we Click button in Child Component : {{receivedData}}</h1>
  </div>
  `
})
export class AppComponent {

  title = 'child-to-parent-data-passing';
  receivedData! :string;

  receivedDataFromChild(data:string)
  {
     this.receivedData = data;
  }
}
