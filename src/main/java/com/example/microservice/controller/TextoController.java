package com.example.microservice.controller;

import com.example.microservice.model.TextoType;
import com.example.microservice.service.ITextoService;
import com.example.microservice.validator.TextoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/texto")
public class TextoController {

    private final ITextoService textoService;

    public TextoController(ITextoService textoService, TextoValidator textoValidator) {
        this.textoService = textoService;
    }
    
    @PostMapping
    public ResponseEntity<List<TextoType>> TaskTexto(@RequestBody List<String> requestTexto) {

        List<TextoType> resultant = textoService.TaskTexto(requestTexto);
        return ResponseEntity.ok(resultant);

    }
   
}
