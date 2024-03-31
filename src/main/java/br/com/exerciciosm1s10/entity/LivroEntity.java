package br.com.exerciciosm1s10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "livros")
@Data
public class LivroEntity {

    @Id
    private Long id;
    private String titulo;
    private Long anoPublicacao;


}
