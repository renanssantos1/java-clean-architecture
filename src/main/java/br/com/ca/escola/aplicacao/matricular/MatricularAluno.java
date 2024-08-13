package br.com.ca.escola.aplicacao.matricular;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.repositorios.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void executa(MatricularAlunoDTO dados){
        repositorioDeAlunos.matricular(dados.criarAluno());
    }
}
