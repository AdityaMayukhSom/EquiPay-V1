package com.axantial.equipay.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Data
@Table("split")
public class Split {
    @Id
    private Long id;
    private Long userId;
    private Long expenseId;
    private Double split;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
