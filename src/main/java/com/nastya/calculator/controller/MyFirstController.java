package com.nastya.calculator.controller;

import com.nastya.calculator.model.Greeting;
import com.nastya.calculator.model.VolleyballPlayer;
import com.nastya.calculator.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@AllArgsConstructor
public class MyFirstController {
    private static final String template = "Hello,%s!";

    private final PlayerService playerService;
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @GetMapping("/anotherGreeting")
    public String anotherGreeting() {
        return "Hello";
    }

    @PostMapping("/volleyball-player")
    public String addPlayer(@RequestBody VolleyballPlayer volleyballPlayer) {
        playerService.players.add(volleyballPlayer);

        return String.valueOf(playerService.players.size());
    }

    //add getPlayers GET endpoint

}

