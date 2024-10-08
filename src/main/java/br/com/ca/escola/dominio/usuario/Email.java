package br.com.ca.escola.dominio.usuario;

public class Email {

    private String email;

    public Email(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email obrigatorio.");
        }

        if (!email.matches("^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Formato de email invalido.");
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return email;
    }
}
