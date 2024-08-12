package br.com.ca.escola;

import br.com.ca.escola.aplicacao.matricular.MatricularAluno;
import br.com.ca.escola.aplicacao.matricular.MatricularAlunoDTO;
import br.com.ca.escola.repositorios.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno repositorio = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        repositorio.matricular(new MatricularAlunoDTO(nome, email, cpf));
    }
}
