package com.microservices.game.Model.Common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseListResponse<T> {
    private List<T> data;
    private long totalCount;
    private int page;
    private int pageSize;
}
