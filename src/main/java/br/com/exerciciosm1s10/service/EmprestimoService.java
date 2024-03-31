package br.com.exerciciosm1s10.service;

import br.com.exerciciosm1s10.entity.EmprestimosEntity;
import br.com.exerciciosm1s10.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }
    public List<EmprestimosEntity> listaEmprestimos() {
        return emprestimoRepository.findAll();
    }
    public EmprestimosEntity salvaEmprestimos(EmprestimosEntity emprestimosEntity) {
        return emprestimoRepository.save(emprestimosEntity);
    }
    public EmprestimosEntity atualizaEmprestimos (EmprestimosEntity emprestimosEntity) {
        return emprestimoRepository.update(
                emprestimosEntity.getId(),
                emprestimosEntity.getLivro(),
                emprestimosEntity.getMembro(),
                emprestimosEntity.getDataEmprestimo(),
                emprestimosEntity.getDataDevolucao()
        );
    }
    public void deletaEmprestimos(Long id) {
        emprestimoRepository.deleteById(id);
    }
}
