package com.nags.companyservice.service.impl;

import com.nags.companyservice.repos.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nags.companyservice.dto.responses.CompanyResponse;
import com.nags.companyservice.service.CompanyService;

@Service

public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepo repo;

	@Override
	public CompanyResponse CompanyById(int id) {
		return null;
	}
}
