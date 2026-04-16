import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CarroService } from '../carro.service';

@Component({
  selector: 'app-carro-create',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './carro-create.component.html',
  styleUrls: ['./carro-create.component.css']
})
export class CarroCreateComponent {

  carro: any = {
    marca: '',
    modelo: '',
    ano: '',
    cor: '',
    placa: '',
    preco: '',
    quilometragem: ''
  };

  constructor(private service: CarroService) {}

  salvar() {
    this.service.salvar(this.carro).subscribe(() => {
      alert('Carro cadastrado com sucesso! 🚗');

      // limpar formulário
      this.carro = {
        marca: '',
        modelo: '',
        ano: '',
        cor: '',
        placa: '',
        preco: '',
        quilometragem: ''
      };
    });
  }
}