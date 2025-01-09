package dev.ranuka.full_stack_development.repo;

import dev.ranuka.full_stack_development.entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
