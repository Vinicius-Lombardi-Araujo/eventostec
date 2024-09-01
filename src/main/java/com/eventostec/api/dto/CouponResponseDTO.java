package com.eventostec.api.dto;

import java.util.Date;
import java.util.UUID;

public record CouponResponseDTO(
        UUID eventId,
        String code,
        Integer discount,
        Date valid
) {
}
