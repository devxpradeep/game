package com.microservices.game.Mapper;

import com.microservices.game.Entity.Game;
import com.microservices.game.Model.Response.GameResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GameMapper {
    @Mapping(source = "id", target = "gameId")
    GameResponse toDto(Game game);
}
