package com.ibm.fsd.smc.ms.company.controller;

import com.ibm.fsd.smc.ms.company.domain.CompanyEntity;
import com.ibm.fsd.smc.ms.company.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Company Controller
 */
@CrossOrigin
@RestController
//@RequestMapping("/company")
@Slf4j
public class CompanyController {

    @Autowired
    private CompanyService companySvc;

    @GetMapping("/companies")
    public List<CompanyEntity> findAll() {
        return companySvc.findAll();
    }

    @GetMapping("/{id}")
    public CompanyEntity findCompany(@PathVariable("id") Integer id) {
        return companySvc.findById(id);
    }

    @PostMapping("/addition")
    public ResponseEntity<Boolean> addCompany(@RequestBody CompanyEntity company){
        Boolean result = Boolean.FALSE;
        companySvc.save(company);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> updateCompany(@RequestBody CompanyEntity company){
        Boolean result = Boolean.FALSE;
        companySvc.save(company);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCompany(@PathVariable("id") Integer id){
        Boolean result = Boolean.FALSE;
        companySvc.deleteById(id);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
