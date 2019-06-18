package com.frossbeamish.serverless.gke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

  @RestController
  class HelloworldController {
    @GetMapping(path = "/", produces = "text/plain;charset=UTF-8")
    String hello(
        @RequestParam(name = "target", required = false, defaultValue = "World") String target) {
      return "Hello World - GKE\n" + "Hello " + target + "!";
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }
}
