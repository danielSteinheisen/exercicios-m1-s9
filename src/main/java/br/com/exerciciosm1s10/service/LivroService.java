package br.com.exerciciosm1s10.service;

import br.com.exerciciosm1s10.entity.LivroEntity;
import br.com.exerciciosm1s10.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }
    public List<LivroEntity> listaLivros() {
        return livroRepository.findAll();
    }
    public LivroEntity salvaLivro(LivroEntity livroEntity) {
        return livroRepository.save(livroEntity);
    }
    public LivroEntity atualizaLivro(LivroEntity livroEntity) {
        return livroRepository.update(
                livroEntity.getId(),
                livroEntity.getTitulo(),
                livroEntity.getAnoPublicacao()
        );
    }
    public void deletaLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
