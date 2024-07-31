import { Component, OnInit } from '@angular/core';
import { OpenaccountService } from '../services/openaccount.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private login: OpenaccountService) { }
  name= null;

  ngOnInit(): void {
    this.login.getCurrentUser().subscribe((user: any) => {
      this.name=user.firstname + user.middlename + user.lastname;
    });
  }


}
