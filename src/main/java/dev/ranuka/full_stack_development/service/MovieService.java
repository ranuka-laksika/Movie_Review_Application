package dev.ranuka.full_stack_development.service;

import dev.ranuka.full_stack_development.entity.Movies;
import dev.ranuka.full_stack_development.repo.MovieRepository;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Data
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> getMovies(){
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();

    }

    public Optional<Movies> singleMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);

    }
}
