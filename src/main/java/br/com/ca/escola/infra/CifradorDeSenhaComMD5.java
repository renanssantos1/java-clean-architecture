package br.com.ca.escola.infra;

import br.com.ca.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

    @Override
    public String hashDaSenha(String senha) {
        //TODO
        //usar algum cifrador de senha a escolha
        return "";
    }

    @Override
    public boolean validarSenha(String senhaCifrada, String senhaAberta) {
        return senhaCifrada.equals(hashDaSenha(senhaAberta));
    }

}
