package com.axantial.equipay.models;
import com.axantial.equipay.enums.TaskStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Table("task")
public class Task {
    @Id
    private Long id;
    private TaskStatus status;
    private String title;
    private String description;
    private AggregateReference<User, Long> assigneeId;
    private AggregateReference<User, Long> reporterId;
    private LocalDateTime deadline;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
