package com.movies_fcc.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired //using @Autowired, it is easy to access the repository directly without instantiating it
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll(); //findAll() is a built-in method from mongoRepository which is extended by the movieRepository
    }

//    Here the movie is generic as Optional because findById() method can be delivered null values which is ObjectId doesn't exist in the collection
    public Optional<Movie> movieById(ObjectId id){
        return movieRepository.findById(id);
    }

//    service for getting a movie by its imdbId
    public Optional<Movie> movieByImdbId(String id){
        return movieRepository.findMovieByImdbId(id);
    }


}
