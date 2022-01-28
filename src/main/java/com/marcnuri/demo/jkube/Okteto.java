package com.marcnuri.demo.jkube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Okteto {
  @GetMapping
  public String helloOkteto() {
    return "Hello Okteto!";
  }
}
