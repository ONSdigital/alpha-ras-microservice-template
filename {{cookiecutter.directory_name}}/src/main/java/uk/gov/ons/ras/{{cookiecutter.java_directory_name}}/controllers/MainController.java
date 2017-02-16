package uk.gov.ons.ras.{{cookiecutter.project_name}}.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping(value = "/status")
  public String available() {
    return "service is running";
  }
}
