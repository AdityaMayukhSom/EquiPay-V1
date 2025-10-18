package com.axantial.equipay.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Data
@Table("expense_image")
public class ExpenseImage {
    @Id
    private Long id;
    private String url;
    private Long expenseId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
