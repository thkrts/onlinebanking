import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { FormsModule } from '@angular/forms';
import { authInterceptorProviders } from './services/authinterceptor';
import { AccountdetailsComponent } from './dashboard/accountdetails/accountdetails.component';
import { SidebarComponent } from './dashboard/sidebar/sidebar.component';
import { AddpayeeComponent } from './dashboard/addpayee/addpayee.component';
import { ChangepasswordComponent } from './dashboard/changepassword/changepassword.component';
import { ImpsComponent } from './dashboard/imps/imps.component';
import { NeftComponent } from './dashboard/neft/neft.component';
import { RtgsComponent } from './dashboard/rtgs/rtgs.component';
import { AccountstatementComponent } from './dashboard/accountstatement/accountstatement.component';
import { AccountsummaryComponent } from './dashboard/accountsummary/accountsummary.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { OpenaccountComponent } from './openaccount/openaccount.component';
import { ForgetuseridComponent } from './forgetuserid/forgetuserid.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    SignupComponent,
    LoginComponent,
    AdminComponent,
    DashboardComponent,
    AdmindashboardComponent,
    AccountdetailsComponent,
    SidebarComponent,
    AddpayeeComponent,
    ChangepasswordComponent,
    ImpsComponent,
    NeftComponent,
    RtgsComponent,
    AccountstatementComponent,
    AccountsummaryComponent,
    ForgetpasswordComponent,
    OpenaccountComponent,
    ForgetuseridComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
