package br.com.ca.escola.aplicacao.matricular;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.aluno.FabricaDeAluno;
import br.com.ca.escola.repositorios.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void matricular(MatricularAlunoDTO alunoDTO){
        Aluno aluno = FabricaDeAluno
                .comCPFNomeEmail(alunoDTO.getNomeAluno(), alunoDTO.getEmailAluno(), alunoDTO.getEmailAluno()).build();

        repositorioDeAlunos.matricular(aluno);
    }
}
