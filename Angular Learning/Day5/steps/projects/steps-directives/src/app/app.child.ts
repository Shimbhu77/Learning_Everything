import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  standalone: true,
  selector: 'app-child',
  template: `
    <div>
    <h1> Using *ngIf and *ngIfElse Directive</h1>
      <h1 *ngIf="isActive; else elseBlock" style="background-color: green;">
        Currently I am Active.
      </h1>
      <ng-template #elseBlock>
        <h1 style="background-color: red;">Currently I am Not Active</h1>
      </ng-template>
    </div>
  `,
  imports: [CommonModule],
})
export class ChildComponent {
  isActive = true;
}
