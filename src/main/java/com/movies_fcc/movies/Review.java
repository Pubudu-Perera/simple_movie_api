package com.movies_fcc.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews") //reviews collection ain't manually created at the atlas. but it will be created by application itself.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private ObjectId id;

    private String body;

    public Review(String body) {
        this.body = body;
    }
}
