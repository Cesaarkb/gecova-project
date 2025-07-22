// import { Component } from '@angular/core';
// import { SelectionModel } from '@angular/cdk/collections';

// import { MatTableDataSource, MatTableModule } from '@angular/material/table';
// import { MatCheckboxModule } from '@angular/material/checkbox';
// import {MatIconModule} from '@angular/material/icon';

// import {MatPaginatorModule, MatPaginator} from '@angular/material/paginator';
// import { ViewChild, AfterViewInit } from '@angular/core';

// import { PeticionService, peticion } from '../../services/peticion';


// export interface PeriodicElement {
//   position: number;
//   solicitud: string;
//   prioridad: string;
//   cliente: string;
//   uo: string;
//   cod_proyecto: string;
//   nombre_proyecto: string;
//   gestor: string;
//   mercado: string;
//   perfil: string;
//   nivel: string;
//   posiciones_iniciales: number;
//   posiciones_finales: number;
//   tasa: number;
//   tasa_tope: number;
//   modalidad: string;
//   estatus_peticion: string;
//   fecha_solicitud: string;
//   fecha_alta_coe: string;
//   fecha_compromiso_rh: string;
//   folio_p: string;
//   editar_peticion: string;
//   detalle_peticion: string;
//   candidatos_disponibles: string;
// }

// const ELEMENT_DATA: PeriodicElement[] = [
//   {
//     position: 1,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 2,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 3,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 4,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 5,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 6,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 7,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 8,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 9,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 10,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   },
//   {
//     position: 11,
//     solicitud: 'SANT-2025/105',
//     prioridad: 'MÁXIMA',
//     cliente: 'SANTANDER',
//     uo: 'P&A - Santander MX',
//     cod_proyecto: '5ST010',
//     nombre_proyecto: 'SIRENA',
//     gestor: 'Alejandra Cuevas López',
//     mercado: 'JULIO BRAVO',
//     perfil: 'BBDD DESARROLLADOR',
//     nivel: 'JR',
//     posiciones_iniciales: 2,
//     posiciones_finales: 2,
//     tasa: 99.36,
//     tasa_tope: 92.85,
//     modalidad: 'Híbrido',
//     estatus_peticion: 'ABIERTA',
//     fecha_solicitud: '14/07/2025',
//     fecha_alta_coe: '',
//     fecha_compromiso_rh: '',
//     folio_p: '-',
//     editar_peticion: '',
//     detalle_peticion: '',
//     candidatos_disponibles: ''
//   }
// ];

// /**
//  * @title Table with selection
//  */

// @Component({
//   selector: 'app-tabla-component',
//   imports: [MatTableModule, MatCheckboxModule, MatIconModule, MatPaginatorModule],
//   templateUrl: './tabla-component.html',
//   styleUrl: './tabla-component.css'
// })
// export class TablaComponent implements AfterViewInit{
//   @ViewChild(MatPaginator) paginator!: MatPaginator;

//   ngAfterViewInit() {
//     this.dataSource.paginator = this.paginator;
//   }

//   displayedColumns: string[] = ['select', 'position', 'solicitud',
//   'prioridad',
//   'cliente',
//   'uo',
//   'cod_proyecto',
//   'nombre_proyecto',
//   'gestor',
//   'mercado',
//   'perfil',
//   'nivel',
//   'posiciones_iniciales',
//   'posiciones_finales',
//   'tasa',
//   'tasa_tope',
//   'modalidad',
//   'estatus_peticion',
//   'fecha_solicitud',
//   'fecha_alta_coe',
//   'fecha_compromiso_rh',
//   'folio_p',
//   'editar_peticion',
//   'detalle_peticion',
//   'candidatos_disponibles'];
//   dataSource = new MatTableDataSource<PeriodicElement>(ELEMENT_DATA);
//   selection = new SelectionModel<PeriodicElement>(true, []);

//   /** Whether the number of selected elements matches the total number of rows. */
//   isAllSelected() {
//     const numSelected = this.selection.selected.length;
//     const numRows = this.dataSource.data.length;
//     return numSelected === numRows;
//   }

//   /** Selects all rows if they are not all selected; otherwise clear selection. */
//   toggleAllRows() {
//     if (this.isAllSelected()) {
//       this.selection.clear();
//       return;
//     }

//     this.selection.select(...this.dataSource.data);
//   }

//   /** The label for the checkbox on the passed row */
//   checkboxLabel(row?: PeriodicElement): string {
//     if (!row) {
//       return `${this.isAllSelected() ? 'deselect' : 'select'} all`;
//     }
//     return `${this.selection.isSelected(row) ? 'deselect' : 'select'} row ${row.position + 1}`;
//   }

// }

import { Component, ViewChild, AfterViewInit, OnInit } from '@angular/core';
import { SelectionModel } from '@angular/cdk/collections';
import { MatTableDataSource, MatTable } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { PeticionService, peticion } from '../../services/peticion';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-tabla-component',
  templateUrl: './tabla-component.html',
  styleUrls: ['./tabla-component.css'], 
  standalone: true,
  imports: [MatTable,CommonModule,MatTableModule,MatPaginatorModule,MatCheckboxModule]
})
export class TablaComponent implements OnInit, AfterViewInit {
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  displayedColumns: string[] = [
    'select', 'solicitante', 'prioridad', 'cliente', 'unidad', 'codigoProyecto',
    'nombreProyecto', 'nombreGestor', 'perfil', 'nivel', 'posiciones',
    'tasa', 'tasaTope', 'modalidad', 'comentariosGrales'
  ];

  dataSource = new MatTableDataSource<peticion>([]);
  selection = new SelectionModel<peticion>(true, []);

  constructor(private peticionService: PeticionService) {}

  ngOnInit(): void {
    this.peticionService.obtenerPeticiones().subscribe({
      next: (data) => {
        this.dataSource.data = data;
        console.log("recuperado");
        console.log(data)
      },
      error: (err) => {
        console.error('Error al obtener peticiones:', err);
      }
    });
  }

  ngAfterViewInit(): void {
    this.dataSource.paginator = this.paginator;
  }

  isAllSelected() {
    const numSelected = this.selection.selected.length;
    const numRows = this.dataSource.data.length;
    return numSelected === numRows;
  }

  toggleAllRows() {
    if (this.isAllSelected()) {
      this.selection.clear();
      return;
    }
    this.selection.select(...this.dataSource.data);
  }

  checkboxLabel(row?: peticion): string {
    if (!row) {
      return `${this.isAllSelected() ? 'deselect' : 'select'} all`;
    }
    return `${this.selection.isSelected(row) ? 'deselect' : 'select'} row ${row.customer}`;
  }
}
