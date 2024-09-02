package com.example.microservice.controller;

import com.example.microservice.model.TextoDTO;
import com.example.microservice.model.TextoType;
import com.example.microservice.service.ITextoService;
import com.example.microservice.validator.ITextoValidator;
import com.example.microservice.validator.TextoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/texto")
public class TextoController {

    private final ITextoService textoService;



    public TextoController(ITextoService textoService) {
        this.textoService = textoService;
    }
    
    @PostMapping
    public ResponseEntity<List<TextoType>> TaskTexto(@RequestBody TextoDTO textoDTO) {

        List<TextoType> resultant = textoService.TaskTexto(textoDTO.getRequestTexto());
        return ResponseEntity.ok(resultant);

    }
   
}
