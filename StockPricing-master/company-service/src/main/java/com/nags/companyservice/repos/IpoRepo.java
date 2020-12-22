package com.nags.companyservice.repos;

import com.nags.companyservice.entities.Company;
import com.nags.companyservice.entities.Ipo;
import com.nags.companyservice.entities.StockCode;
import com.nags.companyservice.entities.StockExchange;
import com.nags.companyservice.repos.customRepos.IpoRepoCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface IpoRepo extends JpaRepository<Ipo, Integer>, IpoRepoCustom {

    Ipo findById(int id);

    Ipo findIpoByCode(String code);

    List<Ipo> findIposByCodeContaining(String partCode);

    Ipo findIpoByStockCode(StockCode stockCode);

    List<Ipo> findIposByCompany(Company Company);

    List<Ipo> findIposByStockExchange(StockExchange stockExchange);

    List<Ipo> findIposByOpenDateBefore(Date date);

    List<Ipo> findIposByOpenDateBeforeAndOpenDateAfter(Date beforeDate, Date afterDate);
}
