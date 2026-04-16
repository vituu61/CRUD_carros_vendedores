package com.example.crud.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
     private Integer id;
    
    private String nome;
    private String email;
    private String senha;
    private String telefone; 
    private LocalDateTime dataCadastro;   
}
