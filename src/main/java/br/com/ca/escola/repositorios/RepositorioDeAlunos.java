package br.com.ca.escola.repositorios;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.usuario.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarAlunoPorCPF(CPF cpf);

    List<Aluno> listaTodosAlunosMatriculados();

}
