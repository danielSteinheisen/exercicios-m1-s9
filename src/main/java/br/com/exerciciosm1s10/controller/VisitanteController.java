package br.com.exerciciosm1s10.controller;

import br.com.exerciciosm1s10.entity.VisitanteEntity;
import br.com.exerciciosm1s10.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService visitanteService;

    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }
    @GetMapping
    public List<VisitanteEntity> listarVisitantes() {
        return visitanteService.listaVisitantes();
    }
    @PostMapping
    public VisitanteEntity salvarVisitantes(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvaVisitante(visitanteEntity);
    }
    @PutMapping
    public VisitanteEntity atualizarVisitantes(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.atualizaVisitante(visitanteEntity);
    }
    @DeleteMapping
    public String deletarVisitantes(@RequestParam("id") Long id) {
        return "Visitante removido!";
    }

}
