import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountdetailsComponent } from './dashboard/accountdetails/accountdetails.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AccountstatementComponent } from './dashboard/accountstatement/accountstatement.component';
import { AccountsummaryComponent } from './dashboard/accountsummary/accountsummary.component';
import { AddpayeeComponent } from './dashboard/addpayee/addpayee.component';
import { ChangepasswordComponent } from './dashboard/changepassword/changepassword.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ImpsComponent } from './dashboard/imps/imps.component';
import { NeftComponent } from './dashboard/neft/neft.component';
import { RtgsComponent } from './dashboard/rtgs/rtgs.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { OpenaccountComponent } from './openaccount/openaccount.component';
import { AdminguardService } from './services/adminguard.service';
import { NormalguardService } from './services/normalguard.service';
import { SignupComponent } from './signup/signup.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { ForgetuseridComponent } from './forgetuserid/forgetuserid.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    redirectTo: '',
    pathMatch: 'full',
  },
  {
    path: 'signup',
    component: SignupComponent,
    pathMatch: 'full',
  },
  {
    path: 'login',
    component: LoginComponent,
    pathMatch: 'full',
  },
  {
    path: 'openaccount',
    component: OpenaccountComponent,
    pathMatch: 'full',
  },
  {
    path: 'forgotpassword',
    component: ForgetpasswordComponent,
    pathMatch: 'full',
  },
  {
    path: 'forgotuserid',
    component: ForgetuseridComponent,
    pathMatch: 'full',
  },
  {
    path: 'admin',
    component: AdmindashboardComponent,
    canActivate: [AdminguardService],
  },
  {
    path: 'dashboard',
    component: DashboardComponent,
    canActivate: [NormalguardService],
    children: [
      {
        path: 'login',
        component: LoginComponent,
      },
      {
        path: 'signup',
        component: SignupComponent,
      },
      {
        path: 'addpayee',
        component: AddpayeeComponent,
      },
      {
        path: 'changepassword',
        component: ChangepasswordComponent,
      },
      {
        path: 'imps',
        component: ImpsComponent,
      },
      {
        path: 'rtgs',
        component: RtgsComponent,
      },
      {
        path: 'neft',
        component: NeftComponent,
      },
      {
        path: 'accountstatement',
        component: AccountstatementComponent,
      },
      {
        path: 'accountsummary',
        component: AccountsummaryComponent,
      },
      {
        path: 'accountdetails',
        component: AccountdetailsComponent,
      },


    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
