package com.prova.java.Repository;


import com.prova.java.Controller.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}

