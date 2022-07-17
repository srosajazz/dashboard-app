package com.sergiorosa.dsapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergiorosa.dsapp.entities.Sale;
import com.sergiorosa.dsapp.repositories.SaleRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales(){
		return repository.findAll();
	}
}
