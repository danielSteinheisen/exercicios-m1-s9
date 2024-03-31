package br.com.exerciciosm1s10.repository;

import br.com.exerciciosm1s10.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Query(
            name = "Update VisitnteEntity v " +
                    "Set v.nome = :nome, " +
                    "v.telefone = :telefone " +
                    "where v.id = :id"
    )
    VisitanteEntity update(@Param("id") Long id,
                           @Param("nome") String nome,
                           @Param("telefone") String telefone);
}
