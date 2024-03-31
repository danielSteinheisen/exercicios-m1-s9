package br.com.exerciciosm1s10.repository;

import br.com.exerciciosm1s10.entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Query(
            name = "Update BibliotecarioEntity b " +
                    "Set b.nome = :nome, " +
                    "b.email = :email, " +
                    "b.senha = :senha " +
                    "where b.id = :id"
    )
    BibliotecarioEntity update(@Param("id") Long id,
                               @Param("nome") String nome,
                               @Param("email") String email,
                               @Param("senha") Long senha);
}
