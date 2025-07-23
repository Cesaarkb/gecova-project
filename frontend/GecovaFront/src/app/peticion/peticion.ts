import { Component,} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Auth } from '../services/auth';
import { Router } from '@angular/router';
import { peticion, PeticionService } from '../services/peticion';


@Component({
  selector: 'app-peticion',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './peticion.html',
  styleUrl: './peticion.css'
})
export class Peticion {

peticionForm!: FormGroup;

 constructor(
    private fb: FormBuilder,
    private router: Router,
    private peticionService:PeticionService,
    
  ) {
  this.peticionForm = this.fb.group({
  customer: [[Validators.required]], //yap
  organizationUnit:['', [Validators.required]],     //yap
  managerName:['', [Validators.required]],          //yap
  applicant:['', [Validators.required]],            //yap
  companyName:['', [Validators.required]],          //yap
  priority: ['', [Validators.required]],            //yap
  position: ['0', [Validators.required]],      //yap
  typeContratc: ['', [Validators.required]],         //yap
  projectCode: ['', [Validators.required]],         //yap
  projectName: ['', [Validators.required]],           //yap
  elementContratc:  ['', [Validators.required]],        //yap
  monthAssign: ['0', [Validators.required]],             //yap
  mode: ['', [Validators.required]],                  //yap
  definitivePlace: ['', [Validators.required]],         //yap
  typeAssign: ['', [Validators.required]],              //yap
  careerPlan: ['', [Validators.required]],              //yap
  developmentRole: ['', [Validators.required]],         //yap
  talentPerformance: ['', [Validators.required]],         //yap
  rate: ['0', [Validators.required]],                  //yap
  rateCap: ['0', [Validators.required]],                 //yap
  projectType: ['', [Validators.required]],               //yap
  budgetedMargin: ['0', [Validators.required]],            //yap
  accumulatedMargin: ['0', [Validators.required]],         //yap
  recoveryPlan: ['', [Validators.required]],            //yap
  generalComments: ['', [Validators.required]],       //yap
  profile: ['', [Validators.required]],             //yap
  level: ['', [Validators.required]],           //yap
  technicalKnowledge: ['', [Validators.required]],
  functionalKnowledge: ['', [Validators.required]],
    });
  }


  onSubmit(){
  const raw = this.peticionForm.value;
  const data: Peticion = {
    ...raw,
    position: parseInt(raw.position),
    monthAssign: parseInt(raw.monthAssign),
    rate: parseFloat(raw.rate),
    rateCap: parseFloat(raw.rateCap),
    budgetedMargin: parseFloat(raw.budgetedMargin),
    accumulatedMargin: parseFloat(raw.accumulatedMargin),
  };

    if(this.peticionForm.valid){
      
       const data: peticion = this.peticionForm.value;
       console.log(this.peticionForm.value);
       

      this.peticionService.crearPeticion(data).subscribe({
        next: (respuesta) => {
          console.log('Petición creada correctamente:', respuesta);
          this.router.navigate(['/peticiones']);
          alert("Peticion Creada");
        },
         error: (err) => {
          console.error('Error al crear petición:', err);
        }
      });
    } else {
      console.log(this.peticionForm.value);
      console.log('Formulario inválido');
    }

    }
}


