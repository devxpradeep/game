package com.microservices.game.Controller;

import com.microservices.game.Model.Common.BaseListResponse;
import com.microservices.game.Model.Response.GameResponse;
import com.microservices.game.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<BaseListResponse<GameResponse>> getAllGames(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        BaseListResponse<GameResponse> resp = gameService.getAllGames(page, pageSize);
        return ResponseEntity.ok(resp);
    }
}
