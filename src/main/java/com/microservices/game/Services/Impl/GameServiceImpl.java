package com.microservices.game.Services.Impl;

import com.microservices.game.Entity.Game;
import com.microservices.game.Mapper.GameMapper;
import com.microservices.game.Model.Common.BaseListResponse;
import com.microservices.game.Model.Response.GameResponse;
import com.microservices.game.Repository.GameRepository;
import com.microservices.game.Services.GameService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;
    private final GameMapper gameMapper;
    public GameServiceImpl(GameRepository gameRepository,
                           GameMapper gameMapper){
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }
    @Override
    public BaseListResponse<GameResponse> getAllGames(int page, int pageSize) {
        Page<Game> gamePage = gameRepository.findAll(PageRequest.of(page, pageSize));
        return BaseListResponse.<GameResponse>builder()
                .pageSize(pageSize)
                .page(page)
                .data(gamePage.map(gameMapper::toDto).toList())
                .totalCount(gamePage.getTotalElements())
                .build();
    }
}
