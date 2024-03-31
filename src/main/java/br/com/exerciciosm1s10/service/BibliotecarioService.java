package br.com.exerciciosm1s10.service;

import br.com.exerciciosm1s10.entity.BibliotecarioEntity;
import br.com.exerciciosm1s10.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }
    public List<BibliotecarioEntity> listaBibliotecario() {
        return bibliotecarioRepository.findAll();
    }
    public BibliotecarioEntity salvaBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }
    public BibliotecarioEntity atualizaBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.update(
                bibliotecarioEntity.getId(),
                bibliotecarioEntity.getNome(),
                bibliotecarioEntity.getEmail(),
                bibliotecarioEntity.getSenha()
        );
    }
    public void deletaBibliotecario(Long id) {
        bibliotecarioRepository.deleteById(id);
    }

}
