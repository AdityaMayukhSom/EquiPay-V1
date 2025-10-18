package com.axantial.equipay.models;

import com.axantial.equipay.enums.PaymentStatus;
import com.axantial.equipay.enums.SplitType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Table("expense")
public class Expense {
    @Id
    private long id;

    private AggregateReference<User, Long> payeeId;
    private AggregateReference<Tribe, Long> tribeId;

    private double amount;
    private String title;

    private PaymentStatus status;
    private SplitType splitType;

    private List<Split> splits;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
