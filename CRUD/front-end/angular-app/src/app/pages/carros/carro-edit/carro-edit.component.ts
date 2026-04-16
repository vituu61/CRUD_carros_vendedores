import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router'; // 👈 AQUI
import { CarroService } from '../carro.service';

@Component({
  selector: 'app-carro-update',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './carro-edit.component.html',
  styleUrls: ['./carro-edit.component.css']
})
export class CarroEditComponent implements OnInit {

  carro: any = {};
  id!: number;

  constructor(
    private service: CarroService,
    private route: ActivatedRoute, // 👈 PEGA DADOS DA URL
    private router: Router         // 👈 FAZ NAVEGAÇÃO
  ) {}

  ngOnInit() {
    // 👇 pega o ID da URL
    this.id = Number(this.route.snapshot.paramMap.get('id'));

    // 👇 busca o carro no backend
    this.service.buscarPorId(this.id).subscribe(data => {
      this.carro = data;
    });
  }

  atualizar() {
    this.service.atualizar(this.id, this.carro).subscribe(() => {
      alert('Carro atualizado com sucesso! 🚗');

      // 👇 redireciona para lista
      this.router.navigate(['/carros']);
    });
  }
}