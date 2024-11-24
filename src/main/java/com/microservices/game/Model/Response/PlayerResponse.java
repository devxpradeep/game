package com.microservices.game.Model.Response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PlayerResponse {
    private String playerId;
    private String userId;
    private String nickname;
    private String avatarUrl;
    private int level;
    private long experiencePoints;
    private String rank;
    private double credits;
    private LocalDateTime joinedDate;
    private LocalDateTime lastActiveDate;
    private int totalPlaytime;
    private int achievementsCount;
    private String status;
    private String guildId;
    private String bio;
    private String region;
}
