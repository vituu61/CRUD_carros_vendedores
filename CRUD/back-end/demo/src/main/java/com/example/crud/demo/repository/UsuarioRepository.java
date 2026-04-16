package com.example.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.demo.entity.Usuario;

public interface  UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
