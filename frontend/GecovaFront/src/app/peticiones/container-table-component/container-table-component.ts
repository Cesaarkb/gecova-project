import { Component, Output,EventEmitter } from '@angular/core';
import { ButtonComponent } from '../button-component/button-component';
import { FiltrosComponent } from '../filtros-component/filtros-component';
import { TablaComponent } from '../tabla-component/tabla-component';

@Component({
  selector: 'app-container-table-component',
  imports: [ ButtonComponent, FiltrosComponent, TablaComponent],
  templateUrl: './container-table-component.html',
  styleUrl: './container-table-component.css'
})
export class ContainerTableComponent {
  @Output() nuevaPeticion = new EventEmitter<void>();

  catchNuevaPeticion(){
    this.nuevaPeticion.emit();
  }

}
