package com.saveit.Controller;

import com.saveit.Model.FinancialRegister;
import com.saveit.Service.FinancialRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registers")
public class FinancialRegisterController {

    @Autowired
    FinancialRegisterService financialRegisterService ;

    @GetMapping
    public List<FinancialRegister> findAll(){
        return financialRegisterService.findAll();
    }

    @GetMapping("/searchByCode/{code}")
    public FinancialRegister findByCode(Long code){
        return financialRegisterService.findByCode(code);
    }

    @PostMapping
    public FinancialRegister create(FinancialRegister financialRegister){
        return financialRegisterService.create(financialRegister);
    }

    @PutMapping
    public FinancialRegister update(FinancialRegister financialRegister, Long code){
        return financialRegisterService.update(financialRegister, code);
    }

    @PutMapping("desactivateRegister")
    public FinancialRegister desactivateRegister(Long code){
        return financialRegisterService.disactivateRegister(code);
    }
}
