package com.example.Spring_atv1.service;

import com.example.Spring_atv1.model.Aluno;
import com.example.Spring_atv1.repository.Alunorepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class Alunoservice {

    private final Alunorepository repository;

    //read
    public List<Aluno> listar(){
        return repository.findAll();
    }
    //read buscar por id
    public Aluno buscarPorID(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }
    public Aluno salvar(Aluno aluno){
        return repository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno dados){
        Aluno aluno = buscarPorID(id);
        aluno.setNome(dados.getNome());
        aluno.setCurso(dados.getCurso());
        aluno.setMatricula(dados.getMatricula());
        return repository.save(aluno);
    }
    public void excluir(Long id){
        repository.deleteById(id);
    }

}