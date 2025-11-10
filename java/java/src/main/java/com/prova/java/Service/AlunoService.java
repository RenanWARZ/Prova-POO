package com.prova.java.Service;


import com.prova.java.Controller.Aluno;
import com.prova.java.Repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listarTodos() { return repository.findAll(); }
    public Aluno buscarPorId(Long id) { return repository.findById(id).orElseThrow(); }
    public Aluno salvar(Aluno aluno) { return repository.save(aluno); }
    public Aluno atualizar(Long id, Aluno novo) {
        Aluno aluno = buscarPorId(id);
        aluno.setNome(novo.getNome());
        aluno.setMatricula(novo.getMatricula());
        aluno.setStatus(novo.getStatus());
        aluno.setCurso(novo.getCurso());
        return repository.save(aluno);
    }
    public void excluir(Long id) { repository.deleteById(id); }

    public List<Aluno> listar() {

        return List.of();
    }

    public void deletar(Long id) {

    }
}
