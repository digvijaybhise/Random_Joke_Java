package com.geekster.RandomJokes.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JokesController {
    static ArrayList<String> jokesList = new ArrayList<>();
    @PostMapping("/jokes")
    public String saved(@RequestBody String joke){
        jokesList.add(joke);
        return "Joke Saved";
    }
    @GetMapping("/jokes")
    public String jokes(){

//        jokes.add("Why can’t you send a duck to space?\n" +
//                "Because the bill would be astronomical!");
//        jokes.add("What does Jeff Bezos do before he goes to sleep?\n" +
//                "He puts his PJ-Amazon!");
//        jokes.add("What did the mama cow say to the calf?\n" +
//                "It’s pasture bedtime!");
//        jokes.add("How does a vampire start a letter?\n" +
//                "Tomb it may concern!");
//        jokes.add("What did one plate say to the other?\n" +
//                "Dinner is on me!");
//        jokes.add("Why do hummingbirds hum?\n" +
//                "Because they don’t know the words!");

        int randomjokes = 0 + (int) (Math.random() * (((jokesList.size() - 1)  - 0) + 1));
        return jokesList.get(randomjokes);
    }
}
