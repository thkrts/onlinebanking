import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OpenaccountService {

  constructor(private http: HttpClient) { }

  public loginStatusSubject = new Subject<boolean>();


  public openaccount(user: any) {
    return this.http.post(`${baseUrl}/registration`, user);

  }

  public getCurrentUser() {
    return this.http.get(`${baseUrl}/registration/current-user-details`);
  }

}
