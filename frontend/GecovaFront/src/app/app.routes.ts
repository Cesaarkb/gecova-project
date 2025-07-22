import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login-component/login-component';
import { Home } from './home/home';
import { peticiones } from './peticiones/peticiones';
import { Peticion } from './peticion/peticion';
import { authGuard } from './auth-guard';

export const routes: Routes = [
  { path: 'login', component: LoginComponent },      
  { path: 'home', component: Home ,canActivate: [authGuard]},
  {path:'peticiones',component:peticiones,canActivate: [authGuard]},
  {path:'peticion',component:Peticion,canActivate: [authGuard]}     
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
