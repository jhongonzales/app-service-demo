package org.example.appservice.controller;

import java.util.List;
import org.example.appservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class TestController {

  @GetMapping("/users")
  public Mono<List<User>> test() {
    return Mono.just(
        List.of(
            new User("1", "John Doe", "john.doe@example.com"),
            new User("2", "Jane Smith", "jane.smith@example.com")
        )
    );
  }

}
