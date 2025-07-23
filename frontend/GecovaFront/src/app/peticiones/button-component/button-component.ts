import { Component, Output,EventEmitter} from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatButtonModule} from '@angular/material/button';
import { MatTooltipModule } from '@angular/material/tooltip';

@Component({
  selector: 'app-button-component',
  imports: [MatIconModule, MatDividerModule,MatButtonModule,MatTooltipModule ],
  templateUrl: './button-component.html',
  styleUrl: './button-component.css'
})
export class ButtonComponent {
  tooltipText = 'Nueva Petición - Agregar registros';
  @Output() addPeticion = new EventEmitter<void>();

  nuevaPeticion(){
    this.addPeticion.emit();
  }
}
