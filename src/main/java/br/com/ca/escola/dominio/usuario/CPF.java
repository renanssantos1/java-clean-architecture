package br.com.ca.escola.dominio.usuario;

import java.util.Objects;

public class CPF {
    private String numeroCPF;

    public CPF(String numeroCpf) {
        if (Objects.isNull(numeroCpf) || numeroCpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$\n")) {
            throw new IllegalArgumentException("CPF invalido, corrija os campos");
        }

        this.numeroCPF = numeroCpf;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    @Override
    public String toString() {
        return numeroCPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cpf = (CPF) o;
        return numeroCPF.equals(cpf.numeroCPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCPF);
    }
}
