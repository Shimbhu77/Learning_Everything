import { CommonModule } from "@angular/common";
import { Component } from "@angular/core";
import exp from "constants";

@Component({
    standalone:true,
    selector:'app-ngswitch',
    template:`<div>
        <h1>*ngSwitch, *ngSwitchCase and *ngSwitchDefault implementation</h1>
        <div [ngSwitch]="rating">
           <h3 *ngSwitchCase="1" class="rating">*</h3>
           <h3 *ngSwitchCase="2" class="rating">**</h3>
           <h3 *ngSwitchCase="3" class="rating">***</h3>
           <h3 *ngSwitchCase="4" class="rating">****</h3>
           <h3 *ngSwitchCase="5" class="rating">*****</h3>
           <h3 *ngSwitchDefault class="rating">not rated</h3>
        </div>
    </div>`,
    imports:[CommonModule],
    styles:[
        `.rating{
            color : goldenrod;
            font-size:50px
        }`
    ]
})

export class NgSwitchComponent
{
   rating = 4;
}