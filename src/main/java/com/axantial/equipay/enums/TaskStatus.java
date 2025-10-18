package com.axantial.equipay.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {
    Assigned("Assigned"),
    Finished("Finished"),
    Cancelled("Cancelled"),
    Declined("Declined");

    private final String status;
}
