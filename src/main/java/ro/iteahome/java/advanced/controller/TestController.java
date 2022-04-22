package ro.iteahome.java.advanced.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/test")
public class TestController {

    @GetMapping("/")
    public String helloGuys() {
        return "helloGuys";
    }
}
