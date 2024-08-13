package br.com.ca.escola.repositorios;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.ca.escola.dominio.usuario.CPF;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarAlunoPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(al -> al.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listaTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
