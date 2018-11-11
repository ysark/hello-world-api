package xyz.ashiras;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping()
  public Greeting get(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

  @PostMapping(consumes = "application/json", produces = "application/json")
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
