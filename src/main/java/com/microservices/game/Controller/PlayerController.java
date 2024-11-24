package com.microservices.game.Controller;

import com.microservices.game.Model.Common.BaseListResponse;
import com.microservices.game.Model.Response.GameResponse;
import com.microservices.game.Model.Response.PlayerResponse;
import com.microservices.game.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @GetMapping
    public ResponseEntity<BaseListResponse<PlayerResponse>> getAllPlayers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        BaseListResponse<PlayerResponse> resp = playerService.getAllPlayers(page, pageSize);
        return ResponseEntity.ok(resp);
    }
}
