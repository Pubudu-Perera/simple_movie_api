package com.movies_fcc.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.movieById(id),HttpStatus.OK);
//    }

//    API for getting movie by its imdbId
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String id){
        return new ResponseEntity<>(movieService.movieByImdbId(id),HttpStatus.OK);
    }
}
