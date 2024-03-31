package br.com.exerciciosm1s10.service;

import br.com.exerciciosm1s10.entity.MembroEntity;
import br.com.exerciciosm1s10.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {

    private final MembroRepository membroRepository;

    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }
    public List<MembroEntity> listaMembros() {
        return membroRepository.findAll();
    }
    public MembroEntity salvaMembros(MembroEntity membroEntity) {
        return membroRepository.save(membroEntity);
    }
    public MembroEntity atualizaMembro(MembroEntity membroEntity) {
        return membroRepository.update(
                membroEntity.getId(),
                membroEntity.getNome(),
                membroEntity.getEndereco(),
                membroEntity.getTelefone()
        );
    }
    public void deletaMembro(Long id) {
        membroRepository.deleteById(id);
    }
}
