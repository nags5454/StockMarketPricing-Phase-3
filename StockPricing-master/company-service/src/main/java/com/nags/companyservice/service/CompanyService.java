package com.nags.companyservice.service;

import com.nags.companyservice.dto.responses.CompanyResponse;

public interface CompanyService {
	
	CompanyResponse CompanyById(int id);

}
