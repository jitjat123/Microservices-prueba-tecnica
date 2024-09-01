
package com.example.microservice.service;

import com.example.microservice.model.TextoType;
import java.util.List;


public interface ITextoService {
    List<TextoType> TaskTexto(List<String> requestTexto);
}
