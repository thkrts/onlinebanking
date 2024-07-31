import { TestBed } from '@angular/core/testing';

import { NormalguardService } from './normalguard.service';

describe('NormalguardService', () => {
  let service: NormalguardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NormalguardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
