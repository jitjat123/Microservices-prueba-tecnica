package com.example.microservice.controller;

import com.example.microservice.model.TextoType;
import com.example.microservice.service.TextoService;
import com.example.microservice.validator.TextoValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TextoController.class)
class TextoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TextoService textoService;

    @MockBean
    private TextoValidator textoValidator;

    @BeforeEach         
    void setUp() {
        doNothing().when(textoValidator).formatValidator(any());
        when(textoService.TaskTexto(any())).thenReturn(Arrays.asList(
            new TextoType("the force is strong in this one", false),
            new TextoType("take what you can give nothing back", true),
            new TextoType("heres looking at you kid", true)
        ));
    }

    @Test
    void testTaskTexto() throws Exception {
        String inputJson = "{ \"requestTexto\" :[\"3\\\\the force is strong in this one\",\"7\\\\take what you can give nothing back\",\"5\\\\Here’s looking at you kid.\"]}";
        String expectedOutputJson = "[{\"text\":\"the force is strong in this one\",\"isCorrect\":false},{\"text\":\"take what you can give nothing back\",\"isCorrect\":true},{\"text\":\"heres looking at you kid\",\"isCorrect\":true}]";

        mockMvc.perform(post("/api/texto")
                .contentType("application/json")
                .content(inputJson))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedOutputJson));
    }
}
        