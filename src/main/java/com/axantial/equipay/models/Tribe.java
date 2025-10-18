package com.axantial.equipay.models;

import com.axantial.equipay.enums.CurrencyEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Table("tribe")
public class Tribe {
    @Id
    private Long id;
    private String title;
    private String description;
    private CurrencyEnum currency;

    private Set<AggregateReference<User, Long>> userIds;
    private Set<AggregateReference<Expense, Long>> expenseIds;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
