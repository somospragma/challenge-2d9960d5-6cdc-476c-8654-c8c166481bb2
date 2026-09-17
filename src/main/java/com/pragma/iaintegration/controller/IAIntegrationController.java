package com.pragma.iaintegration.controller;

import com.pragma.iaintegration.application.IAIntegrationService;
import com.pragma.iaintegration.domain.IASuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iaintegration")
public class IAIntegrationController {
    private final IAIntegrationService iaIntegrationService;

    @Autowired
    public IAIntegrationController(IAIntegrationService iaIntegrationService) {
        this.iaIntegrationService = iaIntegrationService;
    }

    @PostMapping("/integrate")
    public void integrateSuggestions() {
        iaIntegrationService.integrateSuggestions();
    }
}