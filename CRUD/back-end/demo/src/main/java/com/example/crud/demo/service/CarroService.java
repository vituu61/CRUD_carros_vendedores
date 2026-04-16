package com.example.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.crud.demo.entity.Carro;
import com.example.crud.demo.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    // LISTAR TODOS
    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

    // BUSCAR POR ID
    public Optional<Carro> buscarPorId(@NonNull Long id) {
        return carroRepository.findById(id);
    }

    // SALVAR
    public Carro salvar(@NonNull Carro carro) {
        return carroRepository.save(carro);
    }

    // DELETAR
    public void deletar(@NonNull Long id) {
        carroRepository.deleteById(id);
    }

    // ATUALIZAR
    public Optional<Carro> atualizar(@NonNull Long id, @NonNull Carro carroAtualizado) {
        Optional<Carro> carroExistenteOpt = carroRepository.findById(id);

        if (carroExistenteOpt.isEmpty()) {
            return Optional.empty();
        }

        Carro carroExistente = carroExistenteOpt.get();
        carroExistente.setMarca(carroAtualizado.getMarca());
        carroExistente.setModelo(carroAtualizado.getModelo());
        carroExistente.setAno(carroAtualizado.getAno());
        carroExistente.setCor(carroAtualizado.getCor());
        carroExistente.setPlaca(carroAtualizado.getPlaca());
        carroExistente.setPreco(carroAtualizado.getPreco());
        carroExistente.setQuilometragem(carroAtualizado.getQuilometragem());
        carroExistente.setStatus(carroAtualizado.getStatus());

        return Optional.of(carroRepository.save(carroExistente));
    }
}
