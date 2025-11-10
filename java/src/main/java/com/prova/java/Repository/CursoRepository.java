package com.prova.java.Repository;

//Repository
import com.prova.java.Controller.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {}
