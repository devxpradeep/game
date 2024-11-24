package com.microservices.game.Services.Impl;

import com.microservices.game.Entity.PlayerProfile;
import com.microservices.game.Mapper.PlayerMapper;
import com.microservices.game.Model.Common.BaseListResponse;
import com.microservices.game.Model.Response.GameResponse;
import com.microservices.game.Model.Response.PlayerResponse;
import com.microservices.game.Repository.PlayerRepository;
import com.microservices.game.Services.PlayerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;
    public PlayerServiceImpl(PlayerRepository playerRepository,
                           PlayerMapper playerMapper){
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }
    @Override
    public BaseListResponse<PlayerResponse> getAllPlayers(int page, int pageSize) {
        Page<PlayerProfile> playerProfilesPage = playerRepository.findAll(PageRequest.of(page, pageSize));
        return BaseListResponse.<PlayerResponse>builder()
                .pageSize(pageSize)
                .page(page)
                .data(playerProfilesPage.map(playerMapper::toDto).toList())
                .totalCount(playerProfilesPage.getTotalElements())
                .build();
    }
}
