package br.com.exerciciosm1s10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "visitnte")
@Data
public class VisitanteEntity {

    @Id
    private Long id;
    private String nome;
    private String telefone;
}
