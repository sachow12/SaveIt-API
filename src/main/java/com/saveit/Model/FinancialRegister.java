package com.saveit.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
