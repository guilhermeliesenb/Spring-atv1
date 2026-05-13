package com.example.Spring_atv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Spring_atv1.model.Aluno;

public interface Alunorepository extends JpaRepository<Aluno, Long> {
}