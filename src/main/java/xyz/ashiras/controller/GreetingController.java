package xyz.ashiras.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.ashiras.model.Books;
import xyz.ashiras.model.Greeting;
import xyz.ashiras.service.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

  // private static final String template = "Hello, %s!";
  // private final AtomicLong counter = new AtomicLong();

  private final GreetingService service;

  @Autowired
  public GreetingController(GreetingService service) {
    this.service = service;
  }

  @GetMapping()
  public List<Books> get(@RequestParam(value = "name", defaultValue = "") String name) {
    return name.isEmpty() ? this.service.findAll() : this.service.searchByName(name);
  }

  @PostMapping(produces = "application/json")
  public void post(@RequestBody Greeting greeting) {
    // code
  }

  @PutMapping()
  public void put(@RequestBody Greeting greeting) {
    // code
  }

  @DeleteMapping()
  public void delete(@RequestParam(value = "name", defaultValue = "World") String name) {
    // code
  }

  @PatchMapping()
  public void patch(@RequestParam(value = "name", defaultValue = "World") String name) {
    // code
  }
}
