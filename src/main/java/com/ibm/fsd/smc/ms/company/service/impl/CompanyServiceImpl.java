package com.ibm.fsd.smc.ms.company.service.impl;

import com.ibm.fsd.smc.ms.company.domain.CompanyEntity;
import com.ibm.fsd.smc.ms.company.repository.CompanyRepository;
import com.ibm.fsd.smc.ms.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Company Service Implement Class
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepo;

    @Override
    public List<CompanyEntity> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public void save(CompanyEntity stockExchange) {
        companyRepo.save(stockExchange);
    }

    @Override
    public CompanyEntity findById(Integer id) {
         Optional<CompanyEntity> result = companyRepo.findById(id);
         if(result.isPresent()){
             return result.get();
         }else {
             return null;
         }
    }

    @Override
    public void deleteById(Integer id) {
        companyRepo.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(List<CompanyEntity> list) {
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                /*if (i % 2 == 1) {
                    throw new RuntimeException();
                }*/
                companyRepo.save(list.get(i));
            }
        }
    }
}
