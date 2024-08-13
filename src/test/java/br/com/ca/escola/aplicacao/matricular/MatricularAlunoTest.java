package br.com.ca.escola.aplicacao.matricular;

import br.com.ca.escola.dominio.aluno.Aluno;
import br.com.ca.escola.dominio.usuario.CPF;
import br.com.ca.escola.repositorios.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com");

        useCase.executa(dados);

        Aluno alunoEncontrado = repositorio.buscarAlunoPorCPF(
                new CPF("123.456.789-00"));

        assertEquals("Fulano", alunoEncontrado.getNome());
    }

}