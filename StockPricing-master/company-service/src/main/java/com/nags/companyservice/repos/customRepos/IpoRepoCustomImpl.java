package com.nags.companyservice.repos.customRepos;

import com.nags.companyservice.entities.Company;
import com.nags.companyservice.entities.Ipo;

import java.util.List;




public class IpoRepoCustomImpl implements IpoRepoCustom{
    @Override
    public List<Ipo> findIposByCompanySafely(Company company) {
        return null;
    }

    @Override
    public List<Ipo> findIposByCompanySafely(int companyId) {
        return null;
    }
}
