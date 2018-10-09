package org.jdred.filmiki.api;

import org.jdred.filmiki.service.MovieFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieFinder movieFinder;

    @Autowired
    public MovieController(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @GetMapping(params = {"query"})
    public String findByQuery(@RequestParam("query") String query) {
        return movieFinder.search(query);
    }

    @GetMapping(value = "/{imdbId}")
    public String findById(@PathVariable("imdbId") String imdbId) {
        return movieFinder.findById(imdbId);
    }

}
