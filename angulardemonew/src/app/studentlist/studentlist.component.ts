import { Component, OnInit } from '@angular/core';
import { StudentForm } from '../model/student-form';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-studentlist',
  templateUrl: './studentlist.component.html',
  styleUrls: ['./studentlist.component.css']
})
export class StudentlistComponent implements OnInit {

  constructor(private cs:ServiceService) { }

  stu!:StudentForm[];

  ngOnInit(): void {

    this.cs.studentGetData().subscribe(list =>{

      this.stu=list
    })
  }

  deleteDataById(sid :number)
  {
  this.cs.deleteStudentData(sid).subscribe( data =>{
  console.log(data);
  window.location.reload();
})
  }
}
