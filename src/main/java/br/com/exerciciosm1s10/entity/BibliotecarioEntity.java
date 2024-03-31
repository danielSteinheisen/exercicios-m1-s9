package br.com.exerciciosm1s10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bibliotecario")
@Data
public class BibliotecarioEntity {

    @Id
    private Long id;
    private String nome;
    private String email;
    private Long senha;
}
