package com.saveit.Repository;

import com.saveit.Model.FinancialRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRegisterRepository extends JpaRepository<FinancialRegister, Long> {
    FinancialRegister findByCode(Long code);
}
