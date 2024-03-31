package br.com.exerciciosm1s10.controller;

import br.com.exerciciosm1s10.entity.BibliotecarioEntity;
import br.com.exerciciosm1s10.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    public BibliotecarioController(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }
    @GetMapping
    public List<BibliotecarioEntity> listarBibliotecario() {
        return bibliotecarioService.listaBibliotecario();
    }
    @PostMapping
    public BibliotecarioEntity salvarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.salvaBibliotecario(bibliotecarioEntity);
    }
    @PutMapping
    public BibliotecarioEntity atualizarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.atualizaBibliotecario(bibliotecarioEntity);
    }
    @DeleteMapping
    public String deletarBibliotecario(@RequestParam("id") Long id) {
        return "Bibliotecario removido!";
    }
}
