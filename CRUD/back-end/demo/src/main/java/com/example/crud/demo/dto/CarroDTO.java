package com.example.crud.demo.dto;

import java.time.LocalDateTime;

import com.example.crud.demo.entity.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarroDTO {

    private Long id;

    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
    private String placa;
    private Double preco;
    private Integer quilometragem;
    private Status status;

    private LocalDateTime dataCadastro;
}
