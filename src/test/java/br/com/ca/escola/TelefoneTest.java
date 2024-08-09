package br.com.ca.escola;

import br.com.ca.escola.usuario.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefoneComDDDInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", "123"));
    }

    @Test
    void deveriaCriarUmTelefoneComDDDENumerosValidos(){
        String ddd = "11";
        String numero = "966052313";
        Telefone telefone = new Telefone(ddd, numero);

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}