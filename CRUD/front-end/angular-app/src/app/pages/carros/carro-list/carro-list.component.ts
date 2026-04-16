import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { CarroService } from '../carro.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';



@Component({
  selector: 'app-carro-list',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './carro-list.component.html',
  styleUrls: ['./carro-list.component.css'],


})
export class CarroListComponent implements OnInit {


  carros: any[] = [];


  constructor(private service: CarroService, private router: Router) { }


  ngOnInit() {
    this.service.listar().subscribe(data => {
      this.carros = data;
    });
  }

  paginaAtual = 1;
  itensPorPagina = 5;

  get carrosPaginados() {
    const inicio = (this.paginaAtual - 1) * this.itensPorPagina;
    const fim = inicio + this.itensPorPagina;
    return this.carrosFiltrados.slice(inicio, fim);
  }

  editar(id: number) {
    this.router.navigate(['/carros/editar', id]);
  }

  deletar(id: number) {
    const confirmacao = confirm('Tem certeza que deseja excluir este carro?');

    if (confirmacao) {
      this.service.deletar(id).subscribe(() => {

        // remove da lista sem recarregar a página
        this.carros = this.carros.filter(carro => carro.id !== id);

        alert('Carro excluído com sucesso! 🗑️');
      });
    }
  }


  filtro: string = '';
  get carrosFiltrados() {
    const termo = this.filtro?.toLowerCase() || '';

    return this.carros.filter(carro =>
      carro.marca?.toLowerCase().includes(termo) ||
      carro.modelo?.toLowerCase().includes(termo) ||
      carro.placa?.toLowerCase().includes(termo) ||
      carro.cor?.toLowerCase().includes(termo) ||
      carro.ano?.toString().includes(termo)
    );
  }

}