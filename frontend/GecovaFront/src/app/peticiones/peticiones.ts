import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from "./navbar-component/navbar-component";
import { BannerComponent } from "./banner-component/banner-component";
import { ContainerTableComponent } from "./container-table-component/container-table-component";
import { Route ,Router} from '@angular/router';


@Component({
  selector: 'app-peticiones',
  imports: [RouterOutlet, NavbarComponent, BannerComponent, ContainerTableComponent],
  templateUrl: './peticiones.html',
  styleUrl: './peticiones.css'
})
export class peticiones {
  protected readonly title = signal('gecova');

  constructor(private route:Router){}


  nuevaPeticion(){
    this.route.navigate(['/peticion'])
  }
}
