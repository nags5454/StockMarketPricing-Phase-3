package com.nags.companyservice.repos;

import com.nags.companyservice.entities.Company;
import com.nags.companyservice.repos.customRepos.CompanyRepoCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



public interface CompanyRepo extends JpaRepository<Company, Integer>, CompanyRepoCustom {

    List<Company> findCompaniesByNameContaining(String partName);

    Company findCompanyByName(String name);


}
