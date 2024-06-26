package com.unravel.api.controller;

import com.unravel.api.model.WebResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${spring.application.name}")
    private String name;

    @GetMapping(
            path = "/"
    )
    public WebResponse<String> index() {
        return WebResponse.<String>builder().data(String.format("REST API Unravel Malang. [%s] [%s]", activeProfile.toUpperCase(), name.toUpperCase())).build();
    }

}
