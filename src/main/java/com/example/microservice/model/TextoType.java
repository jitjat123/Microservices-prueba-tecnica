package com.example.microservice.model;

public class TextoType {
    
    
    private String text;
    private boolean isCorrect;
            
    public TextoType(String text, boolean isCorrect) {
        
        this.text = text;
        this.isCorrect = isCorrect;
    }
    

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean IsCorrect) {
        this.isCorrect = IsCorrect;
    }
    
}
