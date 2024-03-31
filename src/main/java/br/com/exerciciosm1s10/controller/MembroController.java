package br.com.exerciciosm1s10.controller;

import br.com.exerciciosm1s10.entity.MembroEntity;
import br.com.exerciciosm1s10.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
public class MembroController {

    private final MembroService membroService;

    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }
    @GetMapping
    public List<MembroEntity> listarMembros() {
        return membroService.listaMembros();
    }
    @PostMapping
    public MembroEntity salvarMembros(@RequestBody MembroEntity membroEntity ) {
        return membroService.salvaMembros(membroEntity);
    }
    @PutMapping
    public MembroEntity atualizarMembros(@RequestBody MembroEntity membroEntity) {
        return membroService.atualizaMembro(membroEntity);
    }
    @DeleteMapping
    public String deletarMembros(@RequestParam("id") Long id) {
        membroService.deletaMembro(id);
        return "Membro deletado!";
    }

}
