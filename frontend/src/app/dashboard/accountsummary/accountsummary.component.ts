import { Component, OnInit } from '@angular/core';
import { OpenaccountService } from 'src/app/services/openaccount.service';

@Component({
  selector: 'app-accountsummary',
  templateUrl: './accountsummary.component.html',
  styleUrls: ['./accountsummary.component.css']
})
export class AccountsummaryComponent implements OnInit {
  
acchol = null;
accno = null;


  constructor(private login: OpenaccountService) { }

  ngOnInit(): void {

    this.login.getCurrentUser().subscribe((user: any) => {

      this.acchol = user.firstname + user.middlename + user.lastname;
      this.accno = user.username;

    });
  }

}
