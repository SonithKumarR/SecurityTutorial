package com.example.Security.Tutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SchoolController {// localhost:8080/api/v1/home (In Browser)

    @GetMapping("/home")
    public String home(){
        return "Welcome HOME";
    }

    @GetMapping("/student")
    public String student(){
        return "Welcome STUDENT";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Welcome ADMIN";
    }
    //added extra lines
    //added some code
    //added some code
    //added some code 
}

