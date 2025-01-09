package dev.ranuka.full_stack_development.controller;

import dev.ranuka.full_stack_development.entity.Movies;
import dev.ranuka.full_stack_development.service.MovieService;
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
@RequestMapping(value="/api/v1/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/getMovies")
    public ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<List<Movies>>(movieService.getMovies(), HttpStatus.OK);
   }

   @GetMapping("singleMovie/{id}")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String id){
        return new ResponseEntity<Optional<Movies>>(movieService.singleMovie(id),HttpStatus.OK);
   }
}
