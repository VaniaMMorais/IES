package main.java.com.webservice.webservice;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerJson {
    public List<Show> shows = new ArrayList<>();

    public void add(){
        Movie[] movies = {
            new Movie(1, "Captain America: The First Avenger", "On your left.", "Steve Rogers"),
            new Movie(2, "Avengers: Endgame", "I am Iron Man.", "Tony Stark"),
            new Movie(3, "Avengers: Infinity War", "You Will Never Be A God.", "Loki"),
            new Movie(4, "Thor Ragnarok", "Your Savior Is Here!", "Loki"),
            new Movie(5, "The Amazing Spider-Man", "Secrets have a cost. They're not free. Not now, not ever.", "Peter Parker"),
            new Movie(6, "Spiderman: Homecoming", "Wait a minute... You guys aren't the real Avengers! I can tell. Hulk gives it away.", "Peter Parker"),
        };    
        
        Show show1 = new Show(7, "Modern Family", "God knows I couldn't love them more, but even the Kennedys didn't get together this often.", "Jay Pritchett");
		Show show2 = new Show(8, "Game of Thrones", "No need to seize the last word, Lord Baelish. I'll assume it was something clever.", "Sansa Stark");
		Show show3 = new Show(9, "Grey's Anatomy", "So, pick me. Choose me. Love me.", "Meredith Grey");

		shows.add(show1);
		shows.add(show2);
		shows.add(show3);
    }

    

	@GetMapping("/quotes")
	public Movie quote_movie(@RequestParam(value = "show") int id) {
		return movies[id-1];
	}

    @GetMapping("/shows")
	public List show() {
		return movies;
	}

    @GetMapping("/quote")
	public Movie quote() {
		return movies[new Random().nextInt(movies.length-1)+1];
	}
}
