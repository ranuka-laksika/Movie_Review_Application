package dev.ranuka.full_stack_development.controller;

import dev.ranuka.full_stack_development.entity.Review;
import dev.ranuka.full_stack_development.repo.ReviewRepository;
import dev.ranuka.full_stack_development.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value="/api/v1/reviews")
@CrossOrigin
public class ReviewController {

    @Autowired
    private ReviewService reviewService;
    @PostMapping("/addReview")
    public ResponseEntity<Review> addReview(@RequestBody Map<String,String> payload) {
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.OK);
    }
}
