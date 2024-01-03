import { Component, Input } from "@angular/core";
import { ChildComponent } from "./app.child";

@Component({
    selector:'parent-comp',
    standalone:true,
    imports:[ChildComponent],
    template:`
    <div style="border: 7px solid purple;">
        <h1 style="text-align: center;">This is Parent Component</h1>
        <h2 style="text-align: center;">app title : {{app_title}}</h2>
        <child-comp [message]="message" ></child-comp>
    </div>
    `
})

export class ParentComponent
{
    @Input() app_title!: string;
    message : any = "Message from Parent Component";
}