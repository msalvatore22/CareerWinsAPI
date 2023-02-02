package com.example.msalvatore22.CareerWinsAPI;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WinRepository extends MongoRepository<Win, ObjectId> {
}
