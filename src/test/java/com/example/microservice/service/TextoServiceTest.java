package com.example.microservice.service;


import com.example.microservice.model.TextoType;
import com.example.microservice.service.TextoService;
import com.example.microservice.validator.TextoValidator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TextoServiceTest {

   private final TextoValidator textoValidator = new TextoValidator();
   private final TextoService textoService = new TextoService(textoValidator);

    @Test
    void testTaskTexto() {
        List<String> requestText = Arrays.asList(
            "3\\the force is strong in this one",
            "7\\take what you can give nothing back",
            "5\\Here’s looking at you kid."
        );

        List<TextoType> resultado = textoService.TaskTexto(requestText);

        assertEquals(3, resultado.size());
        assertEquals("the force is strong in this one", resultado.get(0).getText());
        assertFalse(resultado.get(0).getIsCorrect());
        assertEquals("take what you can give nothing back", resultado.get(1).getText());
        assertTrue(resultado.get(1).getIsCorrect());
        assertEquals("heres looking at you kid", resultado.get(2).getText());
        assertTrue(resultado.get(2).getIsCorrect());
    }
}

