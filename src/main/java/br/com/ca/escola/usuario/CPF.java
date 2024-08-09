package br.com.ca.escola.usuario;

import java.util.Objects;

public class CPF {
    private String cpf;

    public CPF(String numeroCpf) {
        if (Objects.isNull(numeroCpf) || numeroCpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$\n")) {
            throw new IllegalArgumentException("CPF invalido, corrija os campos");
        }

        this.cpf = numeroCpf;
    }
}
