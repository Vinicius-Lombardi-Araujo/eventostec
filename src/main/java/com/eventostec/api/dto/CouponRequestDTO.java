package com.eventostec.api.dto;

public record CouponRequestDTO(String code,
                               Integer discount,
                               Long valid) {
}
