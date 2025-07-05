package com.dfl.cyanbird.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DflController {

    // http://localhost:8080/api/hi
    @GetMapping("/hi")
    @ResponseBody
    public String say(@RequestParam("body") String body, @RequestParam int age) {
        Map map = new HashMap<>();
        map.put("body", body);
        map.put("age", age);
        return "body";
    }

    @GetMapping("/oi/{path}")
    @ResponseBody
    public String show(String path) {
        return "she is dancing";
    }
}
