package lk.ac.iit.products_api;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/Yakku")
    public String Yakku(){
        return "Welcome to yakku";

    }}
