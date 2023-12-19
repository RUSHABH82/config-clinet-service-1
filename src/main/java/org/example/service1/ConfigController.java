package org.example.service1;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    private final ConfigProperty configProperty;

    public ConfigController(ConfigProperty configProperty) {
        this.configProperty = configProperty;
    }

    @GetMapping("db")
    ResponseEntity<?> getConfigProperty() throws JsonProcessingException {
        return new ResponseEntity<>(configProperty.toString(), HttpStatus.OK);
    }
}
