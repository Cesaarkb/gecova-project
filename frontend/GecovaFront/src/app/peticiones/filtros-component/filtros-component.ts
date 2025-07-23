import { ChangeDetectionStrategy, Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FilterPipe } from './filter.pipe';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatInputModule } from '@angular/material/input';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import {JsonPipe} from '@angular/common';
import {provideNativeDateAdapter} from '@angular/material/core';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatIconModule} from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import { MatTooltipModule } from '@angular/material/tooltip';


@Component({
  selector: 'app-filtros-component',
  standalone: true,
  providers: [provideNativeDateAdapter()],
  imports: [MatTooltipModule, MatMenuModule, CommonModule, MatFormFieldModule, MatSelectModule, MatInputModule, ReactiveFormsModule, FormsModule, FilterPipe, JsonPipe, MatDatepickerModule, MatIconModule],
  changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './filtros-component.html',
  styleUrl: './filtros-component.css'
})
export class FiltrosComponent {
  
  tooltipTextRefresh= 'Refresh';
  tooltipTextDownload = 'Export to Excel - Exports the currently filtered list of records as an Excel file';
  tooltipTextFilters = 'Manage filters';
  filtros = [
    { filtro: 'CÓDIGO SOLICITUD RRHH', id: 'codigos_rh' },
    { filtro: 'CÓDIGO PROYECTO', id: 'codigos_proyecto' },
    { filtro: 'GESTOR', id: 'gestor' },
    { filtro: 'PRIORIDAD', id: 'prioridad' },
    { filtro: 'PERFIL', id: 'perfil' },
    { filtro: 'ESTATUS', id: 'estatus' },
    { filtro: 'UO', id: 'uo' }
  ]

  formControls: { [key: string]: FormControl } = {};
  searchTexts: { [key: string]: string } = {};

  optionsMap: { [key: string]: { value: string, disabled?: boolean }[] } = {
    codigos_rh: [
      { value: 'PET-2024/041' },
      { value: 'SANT-2023/011' },
      { value: 'SANT-2023/033' },
      { value: 'SANT-2023/045' },
      { value: 'SANT-2023/049' },
      { value: 'SANT-2023/051' },
      { value: 'SANT-2023/054' },
      { value: 'SANT-2023/071' },
      { value: 'SANT-2023/074' },
      { value: 'SANT-2023/076' },
      { value: 'SANT-2023/078' },
    ],
    codigos_proyecto: [
      { value: '2ST380 (1)' },
      { value: '2ST310 (1)' },
      { value: '9ST811 (4)' },
      { value: '9ST036 (4)' },
      { value: '9ST100 (3)' },
      { value: '2ST310 (1)' },
      { value: '9ST036 (5)' },
      { value: '2ST310 (2)' },
      { value: '2ST311 (1)' },
      { value: '1ST030 (6)' },
      { value: '3ST084 (4)' },
    ],
    gestor: [
      { value: 'Alejandra Cuevas López' },
      { value: 'Areli Ramírez Cabañas' },
      { value: 'César Antonio Jiménez Vázquez' },
      { value: 'Claudia Lugarda Segura Hernández' },
      { value: 'Cristian Fabian Ramírez García' },
      { value: 'Eduardo Mondragón Texna' },
      { value: 'Germán Moisés Garrido Espinoza' },
      { value: 'Jaqueline Ruiz Morales' },
      { value: 'José Manuel Vargas Vásquez' },
      { value: 'Marcos Alberto Macedo Hernández' },
      { value: 'Mercedes Potrero Morales' },
    ],
    prioridad: [
      { value: 'Máxima' },
      { value: 'Alta' },
      { value: 'Media' },
      { value: 'Stand By' }
    ],
    perfil: [
      { value: 'ANALISTA FUNCIONAL' },
      { value: 'ANALISTA BIG DATA' },
      { value: 'ARQUITECTO' },
      { value: 'ARQUITECTO DE SOLUCIONES' },
      { value: 'DEV BACK END' },
      { value: 'BBDD DESARROLLADOR' },
      { value: 'BIG DATA' },
      { value: 'BUSINESS ANALYST CELONIS' },
      { value: 'CONSULTOR BI' },
      { value: 'CONSULTOR POWER PLATAFORM' },
      { value: 'DATA ARCHITECT' }
    ],
    estatus: [
      { value: 'ABIERTA' },
      { value: 'CANCELADA' },
      { value: 'OBSERVACIONES PMO' },
      { value: 'ATENDIDA' }
    ],
    uo: [
      { value: 'Arquitecturas y Tecn. Emergentes México (63)' },
      { value: 'Clientes y CRM México (66)' },
      { value: 'Cloud + Soluciones México (10)' },
      { value: 'Inteligencia y Datos México (20)' },
      { value: 'Mercados O&O (7)' },
      { value: 'Operaciones Digitales México (28)' },
      { value: 'BPO (1)' },
      { value: 'P&A - Santander MX (18)' },
      { value: 'Low Code MX (11)' },
      { value: 'Canales MX (6)' },
      { value: 'Data MX (7)' }
    ]

  };

  constructor() {
    for (const filtro of this.filtros) {
      this.formControls[filtro.id] = new FormControl([]);
      this.searchTexts[filtro.id] = '';
    }
  }

  readonly range = new FormGroup({
    start: new FormControl<Date | null>(null),
    end: new FormControl<Date | null>(null),
  });

}
