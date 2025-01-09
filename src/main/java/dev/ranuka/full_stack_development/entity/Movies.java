package dev.ranuka.full_stack_development.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Movies {
    @Id
    @JsonProperty("_id")
    private ObjectId _id;
    @JsonProperty("imdbId")
    private String imdbId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("releaseData")
    private String releaseDate;
    @JsonProperty("trailerLink")
    private String trailerLink;
    @JsonProperty("genres")
    private List<String> genres;
    @JsonProperty("poster")
    private String poster;
    @JsonProperty("backdrops")
    private List<String> backdrops;
    @DocumentReference
    @JsonProperty("reviews")
    private List<Review> reviewIds;


}
