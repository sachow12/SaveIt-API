package com.saveit.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Record {

    @Id
    private Long id;

    private Double monthlyIncome;

    private Double balance;

    private Double expenses;

    private Double bonus;

    private Boolean isUnexpected;

    private String category;

    private LocalDateTime actionDate;

    private LocalDateTime creationDate;

}
