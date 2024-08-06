package escola;

public class Email {

    private String email;

    public Email(String email) {
        if (email.isBlank() || !email.matches("^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$\n")) {
            throw new IllegalArgumentException("Erro no email, verifique os campos.");
        }

        this.email = email;
    }
}
