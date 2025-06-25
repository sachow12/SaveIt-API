package com.saveit.Service;

import com.saveit.Model.FinancialRegister;
import com.saveit.Repository.FinancialRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialRegisterService {

    @Autowired
    FinancialRegisterRepository financialRegisterRepository;

    public List<FinancialRegister> findAll(){
        return financialRegisterRepository.findAll();
    }

    public FinancialRegister create(FinancialRegister financialRegister){
        if(financialRegister == null) throw new NullPointerException("Financial Register is null!");
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
}
