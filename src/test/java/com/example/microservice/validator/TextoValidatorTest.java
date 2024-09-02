package com.example.microservice.validator;

import com.example.microservice.config.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextoValidatorTest {

    private final TextoValidator textoValidator = new TextoValidator();

    @Test
    void testFormatValidator_ValidInput() {
        List<String> textoEntrada = Arrays.asList(
            "3\\valid phrase",
            "7\\another valid phrase"
        );

        assertDoesNotThrow(() -> textoValidator.formatValidator(textoEntrada));
    }

    @Test
    void testFormatValidator_InvalidInput() {
        List<String> textoEntrada = Arrays.asList(
            "3 valid phrase",
            "7\\another valid phrase"
        );

        Exception exception = assertThrows(InvalidFormatException.class, () -> textoValidator.formatValidator(textoEntrada));

        assertEquals("Formato inválido: falta el carácter '\\'.", exception.getMessage());
    }
}