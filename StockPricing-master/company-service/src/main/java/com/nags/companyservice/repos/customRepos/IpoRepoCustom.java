package com.nags.companyservice.repos.customRepos;

import com.nags.companyservice.entities.Company;
import com.nags.companyservice.entities.Ipo;

import java.util.List;



public interface IpoRepoCustom {

    List<Ipo> findIposByCompanySafely(Company company);

    List<Ipo> findIposByCompanySafely(int companyId);


}
