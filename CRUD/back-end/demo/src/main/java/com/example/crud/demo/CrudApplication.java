package com.example.crud.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.crud.demo.entity.Carro;
import com.example.crud.demo.entity.Status;
import com.example.crud.demo.entity.Usuario;
import com.example.crud.demo.repository.CarroRepository;
import com.example.crud.demo.repository.UsuarioRepository;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Bean
    CommandLineRunner testDatabase(CarroRepository carroRepository,
            UsuarioRepository usuarioRepository) {

        return args -> {

            // ----------------------------
            // CARRO 1
            // ----------------------------
            Carro carro1 = new Carro();
            carro1.setMarca("Honda");
            carro1.setModelo("Civic");
            carro1.setAno(2020);
            carro1.setCor("Prata");
            carro1.setPlaca("ABC1234");
            carro1.setPreco(new BigDecimal("85000"));
            carro1.setQuilometragem(30000);
            carro1.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro1);

            // ----------------------------
            // CARRO 2
            // ----------------------------
            Carro carro2 = new Carro();
            carro2.setMarca("Toyota");
            carro2.setModelo("Corolla");
            carro2.setAno(2022);
            carro2.setCor("Preto");
            carro2.setPlaca("DEF5678");
            carro2.setPreco(new BigDecimal("110000"));
            carro2.setQuilometragem(15000);
            carro2.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro2);

            // ----------------------------
            // CARRO 3
            // ----------------------------
            Carro carro3 = new Carro();
            carro3.setMarca("Volkswagen");
            carro3.setModelo("Jetta");
            carro3.setAno(2021);
            carro3.setCor("Branco");

            carro3.setPlaca("GHI9012");
            carro3.setPreco(new BigDecimal("125000"));
            carro3.setQuilometragem(20000);
            carro3.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro3);

            // ----------------------------
            // CARRO 4
            // ----------------------------
            Carro carro4 = new Carro();
            carro4.setMarca("BMW");
            carro4.setModelo("320i");
            carro4.setAno(2023);
            carro4.setCor("Azul");
            carro4.setPlaca("JKL3456");
            carro4.setPreco(new BigDecimal("230000"));
            carro4.setQuilometragem(5000);
            carro4.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro4);

            // ----------------------------
// CARRO 5
// ----------------------------
            Carro carro5 = new Carro();
            carro5.setMarca("Chevrolet");
            carro5.setModelo("Onix");
            carro5.setAno(2023);
            carro5.setCor("Vermelho");
            carro5.setPlaca("MNO7890");
            carro5.setPreco(new BigDecimal("78000"));
            carro5.setQuilometragem(10000);
            carro5.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro5);

// ----------------------------
// CARRO 6
// ----------------------------
            Carro carro6 = new Carro();
            carro6.setMarca("Hyundai");
            carro6.setModelo("HB20");
            carro6.setAno(2022);
            carro6.setCor("Cinza");
            carro6.setPlaca("PQR2345");
            carro6.setPreco(new BigDecimal("72000"));
            carro6.setQuilometragem(12000);
            carro6.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro6);

// ----------------------------
// CARRO 7
// ----------------------------
            Carro carro7 = new Carro();
            carro7.setMarca("Fiat");
            carro7.setModelo("Argo");
            carro7.setAno(2021);
            carro7.setCor("Branco");
            carro7.setPlaca("STU6789");
            carro7.setPreco(new BigDecimal("65000"));
            carro7.setQuilometragem(25000);
            carro7.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro7);

// ----------------------------
// CARRO 8
// ----------------------------
            Carro carro8 = new Carro();
            carro8.setMarca("Jeep");
            carro8.setModelo("Renegade");
            carro8.setAno(2023);
            carro8.setCor("Verde");
            carro8.setPlaca("VWX0123");
            carro8.setPreco(new BigDecimal("135000"));
            carro8.setQuilometragem(8000);
            carro8.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro8);

// ----------------------------
// CARRO 9
// ----------------------------
            Carro carro9 = new Carro();
            carro9.setMarca("Ford");
            carro9.setModelo("Focus");
            carro9.setAno(2019);
            carro9.setCor("Preto");
            carro9.setPlaca("YZA4567");
            carro9.setPreco(new BigDecimal("68000"));
            carro9.setQuilometragem(40000);
            carro9.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro9);

// ----------------------------
// CARRO 10
// ----------------------------
            Carro carro10 = new Carro();
            carro10.setMarca("Nissan");
            carro10.setModelo("Versa");
            carro10.setAno(2020);
            carro10.setCor("Prata");
            carro10.setPlaca("BCD8901");
            carro10.setPreco(new BigDecimal("70000"));
            carro10.setQuilometragem(30000);
            carro10.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro10);

// ----------------------------
// CARRO 11
// ----------------------------
            Carro carro11 = new Carro();
            carro11.setMarca("Audi");
            carro11.setModelo("A3");
            carro11.setAno(2022);
            carro11.setCor("Branco");
            carro11.setPlaca("EFG2345");
            carro11.setPreco(new BigDecimal("180000"));
            carro11.setQuilometragem(15000);
            carro11.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro11);

// ----------------------------
// CARRO 12
// ----------------------------
            Carro carro12 = new Carro();
            carro12.setMarca("Mercedes-Benz");
            carro12.setModelo("C180");
            carro12.setAno(2023);
            carro12.setCor("Preto");
            carro12.setPlaca("HIJ6789");
            carro12.setPreco(new BigDecimal("250000"));
            carro12.setQuilometragem(5000);
            carro12.setStatus(Status.DISPONIVEL);

            carroRepository.save(carro12);

            System.out.println("Carros cadastrados no banco!");

            // ----------------------------
            // USUARIO 1
            // ----------------------------
            Usuario usuario1 = new Usuario();
            usuario1.setNome("Victor Nascimento");
            usuario1.setEmail("victor@email.com");
            usuario1.setSenha("123456");
            usuario1.setTelefone("11999999999");

            usuarioRepository.save(usuario1);

            // ----------------------------
            // USUARIO 2
            // ----------------------------
            Usuario usuario2 = new Usuario();
            usuario2.setNome("Carlos Silva");
            usuario2.setEmail("carlos@email.com");
            usuario2.setSenha("123456");
            usuario2.setTelefone("11988888888");

            usuarioRepository.save(usuario2);

            // ----------------------------
            // USUARIO 3
            // ----------------------------
            Usuario usuario3 = new Usuario();
            usuario3.setNome("Ana Oliveira");
            usuario3.setEmail("ana@email.com");
            usuario3.setSenha("123456");
            usuario3.setTelefone("11977777777");

            usuarioRepository.save(usuario3);

            // ----------------------------
            // USUARIO 4
            // ----------------------------
            Usuario usuario4 = new Usuario();
            usuario4.setNome("Lucas Pereira");
            usuario4.setEmail("lucas@email.com");
            usuario4.setSenha("123456");
            usuario4.setTelefone("11966666666");

            usuarioRepository.save(usuario4);

            System.out.println("Usuarios cadastrados no banco!");
        };
    }
}
