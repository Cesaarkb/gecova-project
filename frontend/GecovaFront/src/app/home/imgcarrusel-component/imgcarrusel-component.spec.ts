import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImgcarruselComponent } from './imgcarrusel-component';

describe('ImgcarruselComponent', () => {
  let component: ImgcarruselComponent;
  let fixture: ComponentFixture<ImgcarruselComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ImgcarruselComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ImgcarruselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
