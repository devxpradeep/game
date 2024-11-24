package com.microservices.game.Mapper;

import com.microservices.game.Entity.PlayerProfile;
import com.microservices.game.Model.Response.PlayerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    @Mapping(source = "id", target = "playerId")
    PlayerResponse toDto(PlayerProfile player);
}
