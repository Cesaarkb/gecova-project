
import { NumberSymbol } from "@angular/common";
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";


 
export interface peticion{



  customer:string;
  organizationUnit:string;  
  managerName:string;
  applicant:string;
  companyName:string;
  priority: string;
  position: number;
  typeContratc: string;
  projectCode: string;
  projectName: string;
  elementContratc:  string;
  monthAssign: number;
  mode: string;
  definitivePlace: string;
  typeAssign: string;
  careerPlan: string;
  developmentRole:string;
  talentPerformance: string;
  rate:number;
  rateCap:number;              
  projectType: string;
  budgetedMargin: number;           
  accumulatedMargin: Number;
  recoveryPlan: string;
  generalComments: string;
  profile: string;
  level:string;
  technicalKnowledge: string;
  functionalKnowledge: string;
  id?:number;
  
}

 
@Injectable({
  providedIn: 'root',



})
export class PeticionService {
 
  private apiUrl = 'http://localhost:8080/peticion';
 
  constructor(private http: HttpClient) {}
 

  
   crearPeticion(dataPeticion:peticion ): Observable<peticion> {
     return this.http.post<peticion>(this.apiUrl,dataPeticion);
   }

   obtenerPeticiones():Observable<peticion[]>{
    return this.http.get<peticion[]>(this.apiUrl);
   }
 
}
