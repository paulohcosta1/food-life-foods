package com.foodlife.foods.api.exceptionHandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;

@JsonInclude(Include.NON_NULL)
@Getter
@Builder

public class Problem {
    private OffsetDateTime timestamp;
    private Integer status;
    private String detail;

    @Getter
    @Builder
    public static class Object {

        private String name;

    }
}