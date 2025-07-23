
import { Component ,OnInit} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { Auth } from '../services/auth';
import { LoginRequest } from '../services/auth';
 
 
 
export interface Usuario {
  username: string;
  password: string;
 
}
 
 
@Component({
  selector: 'login-component',
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './login-component.html',
  styleUrl: './login-component.css'
})
 
 
export class LoginComponent {
 
  loginForm!: FormGroup;
 
  constructor(
    private fb: FormBuilder,
    private router: Router,
    private auth: Auth,
  ) {
    this.loginForm = this.fb.group({
      username: ['', [Validators.required, Validators.minLength(4)]],
      password: ['', [Validators.required, Validators.minLength(4)]]
    });
  }
 
  get username() {
    return this.loginForm.get('username');
  }
 
  get password() {
    return this.loginForm.get('password');
  }

   ngOnInit() {
    if (this.auth.isAuthenticated()) {
      this.router.navigate(['/home']);
    }
  }
 
  onSubmit() {
    if (this.loginForm.valid) {
      const credentials: LoginRequest = this.loginForm.value;
    console.log('Credenciales enviadas:', credentials);
      this.auth.login(credentials).subscribe({
        next: response => {
          console.log("Token recibido:", response.token);

          // guardamos el token en localStorage
          localStorage.setItem('authToken', response.token);
          this.router.navigate(['/home']);
        },
        error: err => {
          console.error("Error en login:", err);
          alert("Usuario o contraseña incorrectos");
        }
      });
 
    } else {
      console.log("Formulario no válido");
      this.loginForm.markAllAsTouched();
    }
  }
}
