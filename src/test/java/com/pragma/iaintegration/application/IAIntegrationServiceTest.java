package com.pragma.iaintegration.application;

import com.pragma.iaintegration.domain.IASuggestion;
import com.pragma.iaintegration.infrastructure.IAClient;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

class IAIntegrationServiceTest {

    @Mock
    private IAClient iaClient;

    @InjectMocks
    private IAIntegrationService iaIntegrationService;

    public IAIntegrationServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void integrateSuggestions() {
        IASuggestion suggestion = new IASuggestion("System.out.println('Hello, World!');", "Imprime un mensaje de saludo");
        when(iaClient.getSuggestion()).thenReturn(suggestion);
        iaIntegrationService.integrateSuggestions();
        // Verificar que se procesó y aplicó la sugerencia
    }
}