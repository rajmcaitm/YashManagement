import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentForm } from '../model/student-form';
import { ServiceService } from '../service.service';


@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

 


  constructor(private fb:FormBuilder,private cs:ServiceService,private acroute:ActivatedRoute,private route:Router) { }
 
  stu!:StudentForm[]
  
  studentform!:FormGroup;

  emailpattern!:"^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$";
  namepattern!:"^[a-zA-Z ]{2,20}$";
  
  sf:any={
    sid:0,
    sname:'',
    address:'',
    mobno:'',
    email:''
 
  }
  ngOnInit(): void {

   
    
    
    this.studentform=this.fb.group({
      sid:[''],
      sname:['',[Validators.required,Validators.pattern(this.namepattern)]],
      address:['',[Validators.required]],
      mobno:['',[Validators.required,Validators.minLength(10),Validators.maxLength(10)]],
      email:['',[Validators.required,Validators.pattern(this.emailpattern)]]
   
    })

    this.cs.getPerticularStudentData(this.acroute.snapshot.params['sid']).subscribe(
      data=> {
       console.log(data);
       this.sf=data;
       
        this.studentform.get('sid')?.setValue(this.sf.sid);
        this.studentform.get('sname')?.setValue(this.sf.sname);
        this.studentform.get('address')?.setValue(this.sf.address);
        this.studentform.get('mobno')?.setValue(this.sf.mobno);
        this.studentform.get('email')?.setValue(this.sf.email);
       
       });
   

    
  }


  onSubmit()
  {

    if(this.studentform.valid && this.sf.sid==0)
    {
    this.cs.StudentSave(this.studentform.value).subscribe();
   
    }
    if(this.studentform.valid && this.sf.sid!=0){
      
      this.cs.updateStudent(this.studentform.value).subscribe();
      
    }
    this.route.navigate(['/studentlist'])
 }

}
