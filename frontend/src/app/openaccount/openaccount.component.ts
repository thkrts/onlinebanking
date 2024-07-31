import { registerLocaleData } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { OpenaccountService } from '../services/openaccount.service';

@Component({
  selector: 'app-openaccount',
  templateUrl: './openaccount.component.html',
  styleUrls: ['./openaccount.component.css']
})
export class OpenaccountComponent implements OnInit {

  constructor(private openaccountService: OpenaccountService) { }

  public user = {
    title: '',
    firstname: '',
    middlename:'',
    lastname:'',
    fathername:'',
    mobno:'',
    eid:'',
    adhaar:'',
    dob:'',
    ral1:'',
    ral2:'',
    ralandmark:'',
    rastate:'',
    racity:'',
    rapin:'',
    pal1:'',
    pal2:'',
    palandmark:'',
    pastate:'',
    pacity:'',
    papin:'',
    occtyp:'',
    soi:'',
    gai:''


  }
  ngOnInit(): void {
  }


  formSubmit(){

    if (this.user.firstname == '' || this.user.firstname == null) {
      alert('Firstname is required !!');
      return;
    }

    if (this.user.lastname == '' || this.user.lastname == null) {
      alert('Lastname is required !!');
      return;
    }

    if (this.user.mobno == '' || this.user.mobno == null) {
      alert('Mobile Number is required !!');
      return;
    }

    if (this.user.eid == '' || this.user.eid == null) {
      alert('Email Id is Mandatory !!');
      return;
    }

    if (this.user.adhaar == '' || this.user.adhaar == null) {
      alert('Aadhaar Number is required !!');
      return;
    }


    this.openaccountService.openaccount(this.user).subscribe(
      (data:any)=>{
        console.log(data.username);
        alert("User Registered Sucessfully");
        alert("Your Account Number is : " + data.username +" Kindly Note down for future reference.");
      },
      (error:any)=>{
        console.log(error);
        alert("User with Same details is already present in database");
      }
    );

  }

}
