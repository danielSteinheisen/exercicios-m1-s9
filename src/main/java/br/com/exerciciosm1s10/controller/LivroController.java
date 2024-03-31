package br.com.exerciciosm1s10.controller;

import br.com.exerciciosm1s10.entity.LivroEntity;
import br.com.exerciciosm1s10.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }
    @GetMapping
    public List<LivroEntity> listarLivros() {
        return livroService.listaLivros();
    }
    @PostMapping
    public LivroEntity salvarLivros(@RequestBody LivroEntity livroEntity) {
        return livroService.salvaLivro(livroEntity);
    }
    @PutMapping
    public LivroEntity atualizarLivros(@RequestBody LivroEntity livroEntity) {
        return livroService.atualizaLivro(livroEntity);
    }
    @DeleteMapping
    public String deletarLivros(@RequestParam("id") Long id) {
        return "Livro deletado!";
    }
}
