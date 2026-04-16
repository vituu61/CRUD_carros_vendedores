import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router'; // 👈 IMPORTANTE

@Component({
  selector: 'app-nav',
  standalone: true,
  imports: [CommonModule, RouterModule], // 👈 AQUI
  templateUrl: './nav.html',
  styleUrls: ['./nav.css'] // 👈 corrigi aqui também
})
export class Nav {

  menuAberto = false;
  carrosAberto = false;
  usuariosAberto = false;

  toggleMenu() {
    this.menuAberto = !this.menuAberto;
  }

  toggleCarros() {
    this.carrosAberto = !this.carrosAberto;
    this.usuariosAberto = false; // melhoria
  }

  toggleUsuarios() {
    this.usuariosAberto = !this.usuariosAberto;
    this.carrosAberto = false; // melhoria
  }
}