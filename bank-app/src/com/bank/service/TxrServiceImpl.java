package com.bank.service;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

/*
 *  design & performance issues
 *  ---------------------------
 *  
 *  --> tight-coupling b/w dependent & dependency
 *  	=> can't extend module with new features
 *  --> too many dependency instances created & discarded
 *  	=> slow,memory/resource use high
 *  --> Unit-Testing not possible
 *  	=> dev/bug fix slow
 *  
 *  
 *  why these issues ?
 *  
 *  	=> dependent itself creating it's own dependency
 *  
 *  soln.
 *  
 *  	=> don't create, get from factory
 *  
 *  Limitation on Factory-lookup:
 *  
 *  	 -> factory-location tight-coupling
 * 
 *  best-soln:
 *  
 *  	=> don't create/lookup, inject/get thru third-party  ( IOC )
 *  
 *  
 *  	how to implement IOC ?
 *  
 *  		==> dependency injection ( DI )
 *  
 *  
 *    -------------------------------------------------------
 *    
 *    
 */

public class TxrServiceImpl implements TxrService {

	
	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void txr(double amount, String fromAccNum, String toAccNum) {
		// ..

		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit & credit

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);
	}

}
