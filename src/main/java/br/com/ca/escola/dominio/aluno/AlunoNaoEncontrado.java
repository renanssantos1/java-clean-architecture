package br.com.ca.escola.dominio.aluno;

import br.com.ca.escola.dominio.usuario.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumeroCPF());
    }
}
