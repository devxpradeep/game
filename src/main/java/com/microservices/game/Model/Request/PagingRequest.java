package com.microservices.game.Model.Request;

import lombok.Getter;

@Getter
public class PagingRequest {
    int pageSize;
    int page;
}