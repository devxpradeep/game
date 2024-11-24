package com.microservices.game.Model.Common;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public class BaseResponse<T> {
    T response;
    String message;
    HttpStatus statusCode;
}
