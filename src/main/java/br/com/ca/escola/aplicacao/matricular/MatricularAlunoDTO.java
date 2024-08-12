package br.com.ca.escola.aplicacao.matricular;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.usuario.CPF;
import br.com.ca.escola.dominio.usuario.Email;

public class MatricularAlunoDTO {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno(){
        return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
    }
}
