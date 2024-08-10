package br.com.ca.escola.aplicacao.indicacao;

import br.com.ca.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno alunoIndicado);
}
