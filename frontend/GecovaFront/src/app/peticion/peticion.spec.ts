import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Peticion } from './peticion';

describe('Peticion', () => {
  let component: Peticion;
  let fixture: ComponentFixture<Peticion>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Peticion]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Peticion);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
