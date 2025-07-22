import { Component,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-triobajo-component',
  imports: [],
  templateUrl: './triobajo-component.html',
  styleUrl: './triobajo-component.css'
})
export class TriobajoComponent {
  @Output() peticiones = new EventEmitter<void>();

  irAPeticiones(){
    this.peticiones.emit();
  }
}
