package com.axantial.equipay.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    Requested("Requested"),
    Settled("Settled"),
    Declined("Declined"),
    Cancelled("Cancelled");

    private final String status;
}
