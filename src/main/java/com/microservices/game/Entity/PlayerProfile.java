package com.microservices.game.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "player_profiles")
public class PlayerProfile {

    @Id
    private String id;

    @Field("user_id")
    private String userId;

    @Field("nickname")
    private String nickname;

    @Field("avatar_url")
    private String avatarUrl;

    @Field("level")
    private int level;

    @Field("experience_points")
    private long experiencePoints;

    @Field("rank")
    private String rank;

    @Field("credits")
    private double credits;

    @Field("joined_date")
    private LocalDateTime joinedDate;

    @Field("last_active_date")
    private LocalDateTime lastActiveDate;

    @Field("total_playtime")
    private int totalPlaytime; // In minutes.

    @Field("achievements_count")
    private int achievementsCount;

    @Field("status")
    private String status;

    @Field("guild_id")
    private String guildId; // Reference to a guild or clan ID.

    @Field("bio")
    private String bio;

    @Field("region")
    private String region;
}
