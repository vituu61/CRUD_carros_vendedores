package com.example.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.demo.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
