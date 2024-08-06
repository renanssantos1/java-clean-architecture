package escola;

import java.util.Objects;

public class Email {

    private String email;

    public Email(String email) {
        if (Objects.isNull(email) || !email.matches("^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$\n")) {
            throw new IllegalArgumentException("Erro no email, verifique os campos.");
        }

        this.email = email;
    }
}
