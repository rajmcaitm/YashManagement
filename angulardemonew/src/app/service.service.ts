import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { StudentForm } from './model/student-form';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(public http:HttpClient) { }
  url:string="http://localhost:9090";
  
  StudentSave(stu:StudentForm)
  {
      return this.http.post<StudentForm>(this.url+"/save",stu);
  }

  studentGetData():Observable<StudentForm[]>
  {
     return this.http.get<StudentForm[]>(this.url+"/getAllData");
  }

 deleteStudentData(sid:number)
 {
     return this.http.delete(this.url+"/deletedata/"+sid);
 }
 getPerticularStudentData(sid:number)
 {
     return this.http.get(this.url+"/getstudent/"+sid);
 }


 updateStudent(student:StudentForm)
 {
  console.log(student);
     return this.http.put<StudentForm>(this.url+"/updatedata/", student);
 }

}
