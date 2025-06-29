package com.saveit.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String email;

    String password;

    String occupation;

    String phone;

    Double balance;

    LocalDateTime birthday;

    LocalDateTime creationDate;

    @OneToMany(mappedBy = "user")
    List<FinancialRegister> financialRegisters;

}
