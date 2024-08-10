package br.com.ca.escola.infra.indicacao;

import br.com.ca.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.ca.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno alunoIndicado) {
        //logica de envio de email com lib Java Mail
    }

}
