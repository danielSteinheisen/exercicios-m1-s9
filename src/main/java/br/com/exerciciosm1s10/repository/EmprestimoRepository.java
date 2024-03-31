package br.com.exerciciosm1s10.repository;

import br.com.exerciciosm1s10.entity.EmprestimosEntity;
import br.com.exerciciosm1s10.entity.LivroEntity;
import br.com.exerciciosm1s10.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface EmprestimoRepository extends JpaRepository<EmprestimosEntity, Long> {

    @Query(
            name = "Update EmprestimoEntity e" +
                    "SET" +
                    "e.livro = :livro ," +
                    "e.membro = :membro ," +
                    "e.data_emprestimo = :data_emprestimo, " +
                    "e.data_devolucao = :data_devolucao " +
                    "where e.id = :id "
    )
    EmprestimosEntity update(@Param("id") Long id,
                             @Param("livro") LivroEntity livro,
                             @Param("membro")MembroEntity membro,
                             @Param("data_emprestimo")LocalDate dataEmprestimo,
                             @Param("data_devolucao") LocalDate dataDevolucao);
}
