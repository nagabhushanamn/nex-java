package com.bank;

import java.time.LocalDate;
import java.util.List;

import com.bank.model.Txn;
import com.bank.service.TxnService;
import com.bank.service.TxnServiceImpl;

public class App2 {

	public static void main(String[] args) {

		TxnService txnService = new TxnServiceImpl();

		List<Txn> txns = txnService.getTxns(1000.00);
		for (Txn txn : txns) {
			System.out.println(txn);
		}

//		List<Txn> txns = txnService.getTxns(LocalDate.of(2018, 5, 22));
//		for (Txn txn : txns) {
//			System.out.println(txn);
//		}

	}

}
