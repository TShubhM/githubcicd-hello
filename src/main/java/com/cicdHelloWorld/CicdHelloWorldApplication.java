package com.cicdHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdHelloWorldApplication {

    @GetMapping
    public String initialResponse() {
        return "Your application is up, and running.";
    }

    @GetMapping("/hello")
    public String helloResponse() {
        return "Hello World";
    }
//    echo "# githubcicd-hello" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/TShubhM/githubcicd-hello.git
//    git push -u origin main

//Command to remove warning LF will get replcaed by CRLF next time git touches it
//    git config core.safecrlf false

    public static void main(String[] args) {
        SpringApplication.run(CicdHelloWorldApplication.class, args);
    }

}
