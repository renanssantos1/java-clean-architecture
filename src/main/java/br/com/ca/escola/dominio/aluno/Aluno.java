package br.com.ca.escola.dominio.aluno;

import br.com.ca.escola.dominio.usuario.CPF;
import br.com.ca.escola.dominio.usuario.Telefone;
import br.com.ca.escola.dominio.usuario.Email;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", email=" + email +
                ", telefones=" + telefones +
                '}';
    }
}
