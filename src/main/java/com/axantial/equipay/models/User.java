package com.axantial.equipay.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Data
@Table("user")
public class User {
    @Id
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String salt;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
