package com.ibm.fsd.smc.ms.company.repository;

import com.ibm.fsd.smc.ms.company.domain.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Company Repository
 */
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
}
