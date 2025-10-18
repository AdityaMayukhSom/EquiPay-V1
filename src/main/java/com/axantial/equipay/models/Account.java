package com.axantial.equipay.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Data
@Table("account")
public class Account {
    @Id
    private long id;
    private double balance;

    private long tribeId;
    private long userId;

    private boolean isActive;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
