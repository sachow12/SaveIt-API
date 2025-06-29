package com.saveit.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class FinancialRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Double monthlyIncome;

    Double expenses;

    Double bonus;

    Boolean isUnexpected;

    String category;

    LocalDateTime actionDate;

    LocalDateTime creationDate;

    Long code;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    Boolean isActive = true;

}
