package com.codefusion.stockerbackend.Models;

import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User {

    @Id
    private String id;

    private String name;
    private String surname;
    private String email;
    private String phone;

    @OneToOne
    private StockerType stockerType;

}