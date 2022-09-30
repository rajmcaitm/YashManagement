import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
import { StudentForm } from '../model/student-form';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  constructor(private fb:FormBuilder,private cs:ServiceService) { }
 
  stu!:StudentForm[]
  
  studentform!:FormGroup;

  emailpattern!:"^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$";
  namepattern!:"^[a-zA-Z ]{2,20}$";
  
  ngOnInit(): void {


    this.studentform=this.fb.group({
      sid:[''],
      sname:['',[Validators.required,Validators.pattern(this.namepattern)]],
      address:['',[Validators.required]],
      mobno:['',[Validators.required,Validators.minLength(10),Validators.maxLength(10)]],
      email:['',[Validators.required,Validators.pattern(this.emailpattern)]]
   
    })
  }


  onSubmit()
  {

    if(this.studentform.valid)
    {
    this.cs.StudentSave(this.studentform.value).subscribe();
    window.location.reload();
    }
 }
}
