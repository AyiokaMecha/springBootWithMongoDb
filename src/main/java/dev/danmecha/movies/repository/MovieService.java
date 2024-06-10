package dev.danmecha.movies.repository;

import dev.danmecha.movies.collections.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovieById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> getSingleMovieByImdbId(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
