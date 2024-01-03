import { Component } from "@angular/core";
import { ChildComponent } from "./app.child";

@Component({
    selector:'parent-comp',
    standalone:true,
    imports:[ChildComponent],
    template:`
    <div style="border: 7px solid purple;">
        <h1 style="text-align: center;">This is Parent Component</h1>
        <child-comp></child-comp>
    </div>
    `
})

export class ParentComponent
{
    message : any = "Message from Parent Component";
}