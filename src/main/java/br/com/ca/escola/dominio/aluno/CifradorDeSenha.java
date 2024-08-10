package br.com.ca.escola.dominio.aluno;

public interface CifradorDeSenha {

    String hashDaSenha(String senha);

    boolean validarSenha(String senhaCifrada, String senhaAberta);
}
