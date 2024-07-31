import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpayeeComponent } from './addpayee.component';

describe('AddpayeeComponent', () => {
  let component: AddpayeeComponent;
  let fixture: ComponentFixture<AddpayeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpayeeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddpayeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
