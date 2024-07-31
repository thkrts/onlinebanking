import { TestBed } from '@angular/core/testing';

import { OpenaccountService } from './openaccount.service';

describe('OpenaccountService', () => {
  let service: OpenaccountService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OpenaccountService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
