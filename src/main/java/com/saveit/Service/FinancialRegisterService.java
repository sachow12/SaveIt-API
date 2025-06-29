package com.saveit.Service;

import com.saveit.Model.FinancialRegister;
import com.saveit.Repository.FinancialRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FinancialRegisterService {

    @Autowired
    FinancialRegisterRepository financialRegisterRepository;

    public List<FinancialRegister> findAll(){
        return financialRegisterRepository.findAll();
    }

    public FinancialRegister findByCode(Long code){
        return financialRegisterRepository.findByCode(code);
    }

    public FinancialRegister create(FinancialRegister financialRegister){
        if(financialRegister == null) throw new NullPointerException("Financial Register is null!");
        financialRegister.setCode(new Random().nextLong());
        return financialRegisterRepository.save(financialRegister);
    }

    public FinancialRegister update(FinancialRegister financialRegister, Long code){
        if(financialRegister == null) throw new NullPointerException("Financial Register is null!");

        FinancialRegister entity = financialRegisterRepository.findByCode(code);

        entity.setCategory(financialRegister.getCategory());
        entity.setExpenses(financialRegister.getExpenses());
        entity.setBonus(financialRegister.getBonus());
        entity.setMonthlyIncome(financialRegister.getMonthlyIncome());
        entity.setActionDate(financialRegister.getActionDate());
        entity.setIsUnexpected(financialRegister.getIsUnexpected());
        return financialRegisterRepository.save(entity);

    }

    public FinancialRegister disactivateRegister(Long code){
        var entity = financialRegisterRepository.findByCode(code);
        entity.setIsActive(false);
        return entity;
    }
}
