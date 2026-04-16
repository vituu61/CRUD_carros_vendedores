import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarroService {

  private api = 'http://localhost:8080/carros';

  constructor(private http: HttpClient) { }

  listar(): Observable<any[]> {
    return this.http.get<any[]>(this.api);
  }

  salvar(carro: any) {
    return this.http.post(this.api, carro);
  }

  atualizar(id: number, carro: any) {
    return this.http.put(`${this.api}/${id}`, carro);
  }

  deletar(id: number) {
    return this.http.delete(`${this.api}/${id}`);
  }
  buscarPorId(id: number) {
    return this.http.get(`${this.api}/${id}`);
  }
}


