package br.com.ca.escola.aluno;

import br.com.ca.escola.usuario.CPF;
import br.com.ca.escola.usuario.Email;

public class FabricaDeAluno {

    private Aluno aluno;

    private FabricaDeAluno() {
    }

    public static class FabricaComCPFNomeEmail {
        private Aluno aluno;

        private FabricaComCPFNomeEmail(Aluno aluno) {
            this.aluno = aluno;
        }

        public FabricaComTelefone comTelefone(String ddd, String numero) {
            this.aluno.adicionarTelefone(ddd, numero);
            return new FabricaComTelefone(aluno);
        }

        public Aluno build() {
            return this.aluno;
        }
    }

    public static class FabricaComTelefone {

        private Aluno aluno;

        private FabricaComTelefone(Aluno aluno) {
            this.aluno = aluno;
        }

        public Aluno build() {
            return this.aluno;
        }
    }

    @Override
    public String toString() {
        return "FabricaDeAluno{" +
                "aluno=" + aluno +
                '}';
    }

    public static FabricaComCPFNomeEmail comCPFNomeEmail(String nome, String cpf, String email) {
        Aluno aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return new FabricaComCPFNomeEmail(aluno);
    }
}
