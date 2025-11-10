package com.prova.java.Service;

import com.prova.java.Controller.Curso;
import com.prova.java.Repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//Service
@Service
public class CursoService {
    private final CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public List<Curso> listarTodos() {
        return repository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }

    public Curso atualizar(Long id, Curso novo) {
        Curso curso = buscarPorId(id);
        curso.setNome(novo.getNome());
        curso.setCargaHoraria(novo.getCargaHoraria());
        return repository.save(curso);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public List<Curso> listar() {

        return List.of();
    }

    public void deletar(Long id) {

    }
}