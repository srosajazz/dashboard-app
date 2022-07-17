package com.sergiorosa.dsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.dsapp.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
