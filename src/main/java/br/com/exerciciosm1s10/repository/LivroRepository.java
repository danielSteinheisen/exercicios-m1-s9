package br.com.exerciciosm1s10.repository;

import br.com.exerciciosm1s10.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Query(
            name = "Update LivroEntity l" +
                    "l.titulo = :titulo, " +
                    "l.ano_publicacao = :ano_publicacao" +
                    "where l.id = :id"
    )
    LivroEntity update(@Param("id") Long id,
                       @Param("titulo") String titulo,
                       @Param("ano_publicacao") Long anoPublicacao);

}
