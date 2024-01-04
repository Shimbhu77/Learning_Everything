import { Component, EventEmitter, Output } from "@angular/core";



@Component({
    standalone:true,
    selector:'child-comp',
    template:`
    <div style="border: 4px solid blue;">
    <h1 style="text-align: center;">Child Component</h1>
    <button (click)="sendDataToParent()" style="display: flex;justify-content: center;" >send Data to Parent</button>
    </div>
    `
})

export class ChildComponent{

    @Output() dataToParent = new EventEmitter<string>();

    sendDataToParent(){
       const data = "Data Coming from Child Component";

       this.dataToParent.emit(data);
    }

}