package com.example.microservice.model;

import java.util.List;

public class TextoDTO {

    private List<String> requestTexto;


    public List<String> getRequestTexto() {
        return requestTexto;
    }

    public void setRequestTexto(List<String> requestTexto) {
        this.requestTexto = requestTexto;
    }
}
