package br.com.exerciciosm1s10.service;

import br.com.exerciciosm1s10.entity.VisitanteEntity;
import br.com.exerciciosm1s10.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteService(VisitanteRepository visitanteRepository){
        this.visitanteRepository = visitanteRepository;
    }
    public List<VisitanteEntity> listaVisitantes() {
        return visitanteRepository.findAll();
    }
    public VisitanteEntity salvaVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }
    public VisitanteEntity atualizaVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.update(
                visitanteEntity.getId(),
                visitanteEntity.getNome(),
                visitanteEntity.getTelefone()
        );
    }
    public void deletaVisitante(Long id) {
        visitanteRepository.deleteById(id);
    }
}
