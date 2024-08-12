package br.com.ca.escola;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.aluno.FabricaDeAluno;
import br.com.ca.escola.repositorios.RepositorioDeAlunos;
import br.com.ca.escola.repositorios.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {
    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        Aluno aluno = FabricaDeAluno.comCPFNomeEmail(nome, cpf, email).build();
        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        aluno.adicionarTelefone("11", "966052313");
        aluno.adicionarTelefone("11", "44895889");
        repositorioDeAlunos.matricular(aluno);

        System.out.println(aluno);
    }
}
