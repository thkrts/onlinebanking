import { Component, OnInit } from '@angular/core';
import { LoginComponent } from 'src/app/login/login.component';
import { LoginService } from 'src/app/services/login.service';
import { OpenaccountService } from 'src/app/services/openaccount.service';

@Component({
  selector: 'app-accountdetails',
  templateUrl: './accountdetails.component.html',
  styleUrls: ['./accountdetails.component.css']
})
export class AccountdetailsComponent implements OnInit {

  username = null;
  firstname = null;
  adhaar = null;
  mobno = null;
  ral1 = null;
  ral2 = null;
  pal1 = null;
  pal2 = null;
  occtyp = null;
  dob = null;

  constructor(private login: OpenaccountService) { }

  ngOnInit(): void {

    this.login.getCurrentUser().subscribe((user: any) => {
      console.log(user);
      this.username = user.username;
      this.firstname = user.firstname;
      this.adhaar = user.adhaar;
      this.mobno = user.mobno;
      this.ral1 = user.ral1 + user.ral2;
      this.pal1 = user.pal1 + user.pal2;
      this.occtyp = user.occtyp;
      this.dob = user.dob;

    });

  }

}
