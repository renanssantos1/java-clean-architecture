package br.com.ca.escola;

import br.com.ca.escola.usuario.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailInvalido"));
    }

    @Test
    void deveSerCriadoUmaInstanciaValidaDeEmail() {
        Email email = new Email("fulano@gmail.com");

        assertEquals(email, email.getEmail());
    }

}