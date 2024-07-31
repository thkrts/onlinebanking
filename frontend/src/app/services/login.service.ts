import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  public loginStatusSubject = new Subject<boolean>();

  constructor(private http: HttpClient) { }

  public getToken() {
    return localStorage.getItem('token');
  }

  public generateToken(loginData: any) {
    return this.http.post(`${baseUrl}/generate-token`, loginData);
  }

  public loginUser(token: any) {
    localStorage.setItem('token', token);

    return true;
  }

  public getCurrentUser() {
    return this.http.get(`${baseUrl}/current-user`);
  }

  public setUserRole(user: any) {
    localStorage.setItem('role', JSON.stringify(user));
  }

  public logout() {
    localStorage.removeItem('token');
    localStorage.removeItem('user');
    return true;
  }

  public getUserRole() {
    let userStr = localStorage.getItem('role');
    if (userStr != null) {
      return JSON.parse(userStr);
    } else {
      this.logout();
      return null;
    }
  }


  public isLoggedIn() {
    let tokenStr = localStorage.getItem('token');
    // console.log(tokenStr);
    if (tokenStr == undefined || tokenStr == '' || tokenStr == null) {
      return false;
    } else {
      return true;
    }
  }

}
