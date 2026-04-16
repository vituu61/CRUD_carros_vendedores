package com.example.crud.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.demo.entity.Carro;
import com.example.crud.demo.service.CarroService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;


     @GetMapping
    public ResponseEntity<List<Carro>> listarTodos() {

        List<Carro> carros = carroService.listarTodos();

        return ResponseEntity.ok(carros);
    }
    // GET - buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Carro> buscarPorId(@PathVariable @NonNull Long id) {

        Optional<Carro> carro = carroService.buscarPorId(id);

        if (carro.isPresent()) {
            return ResponseEntity.ok(carro.get());
        }

        return ResponseEntity.notFound().build();
    }

    // POST - criar carro
    @PostMapping
    public ResponseEntity<Carro> salvar(@RequestBody @NonNull Carro carro) {

        Carro novoCarro = carroService.salvar(carro);

        return ResponseEntity.ok(novoCarro);
    }

    // DELETE - remover carro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable @NonNull Long id) {

        carroService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    // PUT - atualizar carro
    @PutMapping("/{id}")
    public ResponseEntity<Carro> atualizar(@PathVariable @NonNull Long id, @RequestBody @NonNull Carro carro) {
        Optional<Carro> carroAtualizado = carroService.atualizar(id, carro);

        if (carroAtualizado.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(carroAtualizado.get());
    }
}
