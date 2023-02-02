package com.example.msalvatore22.CareerWinsAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.YearMonth;

@Document(collection = "wins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Win {
    @Id
    private ObjectId id;
    private String title;
    private String description;
    private String impact;
    private Boolean highlight;
    private String yearMonth;
    private String updatedAt;
}
