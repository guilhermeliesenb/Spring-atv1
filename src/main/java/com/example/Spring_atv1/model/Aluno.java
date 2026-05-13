package com.example.Spring_atv1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aluno")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Aluno {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String curso;
    private String matricula;
}
