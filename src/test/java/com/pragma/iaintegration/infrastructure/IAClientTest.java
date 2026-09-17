package com.pragma.iaintegration.infrastructure;

import com.pragma.iaintegration.domain.IASuggestion;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IAClientTest {

    @InjectMocks
    private IAClient iaClient;

    public IAClientTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getSuggestion() {
        IASuggestion suggestion = iaClient.getSuggestion();
        assertEquals("System.out.println('Hello, World!');", suggestion.code());
        assertEquals("Imprime un mensaje de saludo", suggestion.description());
    }
}