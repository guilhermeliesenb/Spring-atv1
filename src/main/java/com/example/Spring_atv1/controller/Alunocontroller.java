package com.example.Spring_atv1.controller;

import com.example.Spring_atv1.model.Aluno;
import com.example.Spring_atv1.service.Alunoservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor

public class Alunocontroller {

    private  final Alunoservice service;

    @GetMapping
    public List<Aluno> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorID(id));

    }

    @PostMapping
    public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno){
        return ResponseEntity.ok(service.salvar(aluno));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atulizar(@PathVariable Long id,
                                          @RequestBody Aluno dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}