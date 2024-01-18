import { Routes } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

export const routes: Routes = [
    {path:'first-component',component:FirstComponent},
    {path:'second-component',component:SecondComponent},
    {path:'',redirectTo:'/first-component',pathMatch:'full'},
    {path:'**',component:PagenotfoundComponent}
];
