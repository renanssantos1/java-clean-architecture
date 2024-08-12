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
}
