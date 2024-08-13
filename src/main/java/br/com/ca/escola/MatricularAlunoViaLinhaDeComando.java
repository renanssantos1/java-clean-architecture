package br.com.ca.escola;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.aluno.FabricaDeAluno;
import br.com.ca.escola.dominio.usuario.CPF;
import br.com.ca.escola.repositorios.RepositorioDeAlunos;
import br.com.ca.escola.repositorios.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        Aluno aluno = FabricaDeAluno
                .comCPFNomeEmail("Nome", "123.456.789-00", "email@dominio.com")
                .comTelefone("11", "987654321")
                .build();

        System.out.println(aluno);

        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        repositorioDeAlunos.matricular(aluno);

        var alunoEncontrado = repositorioDeAlunos.buscarAlunoPorCPF(new CPF("123.456.789-00"));
        System.out.println(alunoEncontrado);
    }
}
