package com.microservices.game.Services;

import com.microservices.game.Model.Common.BaseListResponse;
import com.microservices.game.Model.Response.GameResponse;

public interface GameService {
    BaseListResponse<GameResponse> getAllGames(int page, int pageSize);
}
