import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TriobajoComponent } from './triobajo-component';

describe('TriobajoComponent', () => {
  let component: TriobajoComponent;
  let fixture: ComponentFixture<TriobajoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TriobajoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TriobajoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
