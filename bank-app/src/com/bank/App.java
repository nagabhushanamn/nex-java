package com.bank;

import com.bank.repository.AccountRepository;
import com.bank.repository.JdbcAccountRepository;
import com.bank.repository.JpaAccountRepository;
import com.bank.service.TxrService;
import com.bank.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// -----------------------------
		// Init
		// -----------------------------

		AccountRepository jdbcAccountRepository = new JdbcAccountRepository();
		AccountRepository jpaAccountRepository=new JpaAccountRepository();
		TxrService txrService = new TxrServiceImpl(jpaAccountRepository);

		// -----------------------------
		// Use
		// -----------------------------

		txrService.txr(100.00, "1", "2");
		txrService.txr(100, "2", "1");

		// -----------------------------
		// Destroy
		// -----------------------------
	}

}
