package com.saveit.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class User {

    @Id
    private Long id;

    private String name;

    private String email;

    private String occupation;

    private String phone;

    private LocalDateTime birthday;

    private LocalDateTime creationDate;

}
