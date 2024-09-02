package com.example.microservice.service;

import com.example.microservice.model.TextoType;
import com.example.microservice.validator.ITextoValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextoService implements ITextoService {

    private final ITextoValidator textoValidator;

    public TextoService(ITextoValidator textoValidator) {
        this.textoValidator = textoValidator;
    }

    //Funcion que divide el texto en dos partes la anterior y siguiente al '\'
    private TextoType SplitTexto(String linea) {
        String[] split = linea.split("\\\\");
        String text = split[1].replaceAll("[^a-zA-Z ]", "").toLowerCase();
        boolean IsCorrect = split[0].equals(String.valueOf(text.split(" ").length));
        return new TextoType(text, IsCorrect);
    }

    //funcion para procesar el texto
    public List<TextoType> TaskTexto(List<String> requestTexto) {

        textoValidator.formatValidator(requestTexto);

        return requestTexto.stream()
                .map(this::SplitTexto)
                .collect(Collectors.toList());
    }
    
}
