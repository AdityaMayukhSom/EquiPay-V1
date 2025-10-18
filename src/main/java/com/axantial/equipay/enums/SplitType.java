package com.axantial.equipay.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SplitType {
    Equal("Equal"),
    Percentage("Percentage"),
    Exact("Exact");

    private final String type;
}
