package com.nags.companyservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabhu.companyservice.dto.responses.CompanyResponse;
import com.prabhu.companyservice.service.CompanyService;




@RestController
@RequestMapping("/api/info")
public class CompanyController {

	@Autowired
	@Qualifier("complete")
	private CompanyService companyService;
	

	
    @GetMapping("/comapny/{id}")
    public ResponseEntity<CompanyResponse> detailsById(@PathVariable("id") int id){
		
    	CompanyResponse company = this.companyService.CompanyById(id);
    	
    	
    	
    	return null;
    }
}
