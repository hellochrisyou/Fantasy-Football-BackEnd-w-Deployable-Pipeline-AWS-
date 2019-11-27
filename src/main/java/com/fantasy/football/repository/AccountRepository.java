package com.fantasy.football.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fantasy.football.domain.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	@Override
	List<Account> findAll();

	Account findByAcctName(final String curAcctName);
	
	boolean existsByAcctName(final String curAcctName);
}