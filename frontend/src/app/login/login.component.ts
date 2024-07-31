import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})


export class LoginComponent implements OnInit {

  loginData = {
    username: '',
    password: '',
  };

  constructor(private login: LoginService,
    private router: Router) {

  }

  ngOnInit(): void {
    
  }



  formSubmit() {
    // console.log('login btn clicked');

    if (
      this.loginData.username.trim() == '' ||
      this.loginData.username == null
    ) {
      alert('AccouuntNo. is Mandatory');
      return;
    }

    if (
      this.loginData.password.trim() == '' ||
      this.loginData.password == null) {

      alert("password is required");
      return;
    }

    //request to server to generate token
    this.login.generateToken(this.loginData).subscribe(
      (data: any) => {
        // console.log('success');
        // console.log(data);

        //login...
        // alert("Login");
        this.login.loginUser(data.token);

        this.login.getCurrentUser().subscribe((user: any) => {
          this.login.setUserRole(user.role);
           console.log(user);
          // console.log(this.login.getUserRole());

  
          if (user.role == 'ADMIN') {
            // console.log("In admin");
            // alert('In admin');
            this.router.navigate(['admin']);
            this.login.loginStatusSubject.next(true);

          } else if (user.role == 'NORMAL') {
            this.router.navigate(['dashboard']);
            this.login.loginStatusSubject.next(true);
          } else {
            alert('logout');
            this.login.logout();
          }
        });
      },
      (error) => {
        alert("In error of login comp");
        alert(error);
        console.log(error);
        // console.log('Error !');
        // console.log(error);
      }
    );
  }

}
