import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { StudentComponent } from './student/student.component';
import { StudentlistComponent } from './studentlist/studentlist.component';

const routes: Routes = [


{path:"", component:HomeComponent},
{path:"studentreg", component:StudentComponent},
{path:"studentlist", component:StudentlistComponent},
{path:"student/:sid", component:StudentComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
