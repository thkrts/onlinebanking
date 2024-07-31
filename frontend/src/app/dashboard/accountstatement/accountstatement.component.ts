import { Component, OnInit } from '@angular/core';
import { OpenaccountService } from 'src/app/services/openaccount.service';

@Component({
  selector: 'app-accountstatement',
  templateUrl: './accountstatement.component.html',
  styleUrls: ['./accountstatement.component.css']
})
export class AccountstatementComponent implements OnInit {

  username = null;
  name = null;
  constructor(private login: OpenaccountService) { }

  ngOnInit(): void {
    this.login.getCurrentUser().subscribe((user: any) => {
      this.username = user.username;
      this.name = user.firstname;   

    });

  }

}
