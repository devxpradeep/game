package com.microservices.game.Services;

import com.microservices.game.Model.Common.BaseListResponse;
import com.microservices.game.Model.Response.PlayerResponse;

public interface PlayerService {
    BaseListResponse<PlayerResponse> getAllPlayers(int page, int pageSize);
}
