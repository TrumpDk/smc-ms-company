package com.ibm.fsd.smc.ms.company.service;

import com.ibm.fsd.smc.ms.company.domain.CompanyEntity;

import java.util.List;

/**
 * Company Service
 */
public interface CompanyService {

    List<CompanyEntity> findAll();

    void save(CompanyEntity user);

    void save(List<CompanyEntity> list);

    CompanyEntity findById(Integer id);

    void deleteById(Integer id);
}
