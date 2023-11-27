package com.codefusion.stockerbackend.Models;

import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class StockerType {
    @Id
    private String id;

    @OneToOne (mappedBy = "user")
    private String type;

}
