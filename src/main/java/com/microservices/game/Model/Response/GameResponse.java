package com.microservices.game.Model.Response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GameResponse{
    private String gameId;
    private String name;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;
    private String createdBy;
    private String modifiedBy;
    private Boolean isActive;
    private String bgImageUrl;
    private String avatarUrl;
}
