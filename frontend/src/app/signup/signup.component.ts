import { Component, OnInit } from '@angular/core';
import { SignupserviceService } from '../services/signupservice.service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private signupService: SignupserviceService) { }

  public user = {
    username: '',
    password: '',
    confirmpassword: '',
    transpassword: '',
    confirmtranspassword: '',
  };

  ngOnInit(): void {
  }

  formSubmit() {
    if (this.user.username == '' || this.user.username == null) {
      alert('User is required !!');
      return;
    }

    if (this.user.password == '' || this.user.password == null) {
      alert('password is required !!');
      return;
    }

    if (this.user.confirmpassword == '' || this.user.confirmpassword == null) {
      alert('confirmpassword is required !!');
      return;
    }

    if (this.user.transpassword == '' || this.user.transpassword == null) {
      alert('Transactionpassword is required !!');
      return;
    }

    if (this.user.confirmtranspassword == '' || this.user.confirmtranspassword == null) {
      alert('confirmtransactionpassword is required !!');
      return;
    }

    if (this.user.password != this.user.confirmpassword) {
      alert('password mismatch !!');
      return;
    }


    if (this.user.transpassword != this.user.confirmtranspassword ) {
      alert('transactionpassword mismatch !!');
      return;
    }

    //validate
    this.signupService.addUser(this.user).subscribe(
      (data: any) => {
        //success
        // console.log(data);
        alert('Sucessfully Registered for Internet banking');
      },
      (error: any) => {
        //error
        // console.log(error);
        // alert(error);
        alert('Wrong Account number : User with this account number have not an account.');
      }
    );
  }

}
