import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForgetuseridComponent } from './forgetuserid.component';

describe('ForgetuseridComponent', () => {
  let component: ForgetuseridComponent;
  let fixture: ComponentFixture<ForgetuseridComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ForgetuseridComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ForgetuseridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
