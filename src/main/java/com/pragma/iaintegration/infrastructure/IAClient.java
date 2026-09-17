package com.pragma.iaintegration.infrastructure;

import com.pragma.iaintegration.domain.IASuggestion;
import org.springframework.stereotype.Component;

@Component
public class IAClient {
    public IASuggestion getSuggestion() {
        // Simular llamada a la herramienta de IA
        return new IASuggestion("System.out.println('Hello, World!');", "Imprime un mensaje de saludo");
    }
}