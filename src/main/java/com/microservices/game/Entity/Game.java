package com.microservices.game.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String createdBy;
    private String modifiedBy;
    private Boolean isActive;
    private String bgImageUrl;
    private String avatarUrl;
}
