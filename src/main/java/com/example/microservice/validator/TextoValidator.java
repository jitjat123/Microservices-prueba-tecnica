package com.example.microservice.validator;

import java.util.List;
import com.example.microservice.config.InvalidFormatException;
import org.springframework.stereotype.Component;

@Component
public class TextoValidator implements ITextoValidator{

    //funcion que valida que el texto contenga '\'
    public void formatValidator(List<String> requestTexto) {
        for (String linea : requestTexto) {
            if (!linea.contains("\\")){
                throw new InvalidFormatException("Formato inválido: falta el carácter '\\'.");
            }
        }
    }
}
