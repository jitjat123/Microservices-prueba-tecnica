package com.example.microservice.validator;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TextoValidator implements ITextoValidator{
    
    public void formatValidator(List<String> requestTexto) {
        for (String linea : requestTexto) {
            if (!linea.contains("\\")){
                throw new IllegalArgumentException("Formato inválido: falta el carácter '\\'.");
            }
        }
    }
}
