package com.cloud.config.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private final ApplicationConfiguration applicationConfiguration;

    public SampleController(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    @GetMapping("/message")
    public Map<String, String> welcome() {
        final Map<String, String> map = new HashMap<>();
        map.put("message", applicationConfiguration.getMessage());

        return map;
    }
}
