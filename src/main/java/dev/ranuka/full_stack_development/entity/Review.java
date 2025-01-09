package dev.ranuka.full_stack_development.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="review")
public class Review {
    @Id
    private ObjectId id;
    @JsonProperty("reviewBody")
    private String reviewBody;

    public Review(String reviewBody){
        this.reviewBody=reviewBody;
    }
}
