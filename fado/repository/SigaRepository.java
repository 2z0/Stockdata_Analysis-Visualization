package com.fado.repository;



import com.fado.entitiy.CompanyInfo;
import com.fado.entitiy.CompanySiga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SigaRepository extends JpaRepository<CompanySiga, String> {
    CompanySiga findByCompany(String name);
    List <CompanySiga> findBySigaGreaterThan(Long siga);
    List <CompanySiga> findByPriceLessThan(Long price);
    List <CompanySiga> findByPriceLessThanAndSigaIsGreaterThan(Long price, Long siga);
}