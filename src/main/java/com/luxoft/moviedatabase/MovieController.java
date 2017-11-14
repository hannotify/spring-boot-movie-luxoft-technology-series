package com.luxoft.moviedatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<Movie> listMovies() {
        return movieRepository.findAll();
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }

    @PutMapping
    public void updateMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }

    @DeleteMapping
    public void deleteMovie(@RequestParam Long movieId) {
        movieRepository.delete(movieId);
    }
}
