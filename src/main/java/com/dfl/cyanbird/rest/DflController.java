package com.dfl.cyanbird.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DflController {

    @GetMapping("/hi")
    public String say() {
        return "she is a dj";
    }
}
