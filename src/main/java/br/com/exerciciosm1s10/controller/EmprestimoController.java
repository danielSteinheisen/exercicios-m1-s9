package br.com.exerciciosm1s10.controller;


import br.com.exerciciosm1s10.entity.EmprestimosEntity;
import br.com.exerciciosm1s10.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimosService;

    public EmprestimoController(EmprestimoService emprestimosService) {
        this.emprestimosService = emprestimosService;
    }
    @GetMapping
    public List<EmprestimosEntity> listarEmprestimos() {
        return emprestimosService.listaEmprestimos();
    }
    @PostMapping
    public EmprestimosEntity salvarEmprestimos(@RequestBody EmprestimosEntity emprestimosEntity) {
        return emprestimosService.salvaEmprestimos(emprestimosEntity);
    }
    @PutMapping
    public EmprestimosEntity atualizarEmprestimos(@RequestBody EmprestimosEntity emprestimosEntity) {
        return emprestimosService.atualizaEmprestimos(emprestimosEntity);
    }
    @DeleteMapping
    public String deletarEmprestimos(@RequestParam("id") Long id){
        emprestimosService.deletaEmprestimos(id);
        return "Empréstimo deletdo!";
    }
}
