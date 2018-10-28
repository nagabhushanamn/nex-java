package com.bank.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bank.lib.Condition;
import com.bank.lib.TxnUtilLib;
import com.bank.model.Txn;
import com.bank.model.TxnType;

public class TxnServiceImpl implements TxnService {

	private static List<Txn> allTxns = Arrays.asList(new Txn(23123, 1000.00, TxnType.DEBIT, LocalDate.of(2017, 5, 12)),
			new Txn(23123, 2000.00, TxnType.DEBIT, LocalDate.of(2018, 5, 22)),
			new Txn(33123, 1000.00, TxnType.CREDIT, LocalDate.of(2018, 5, 22)),
			new Txn(43123, 4000.00, TxnType.DEBIT, LocalDate.of(2018, 4, 22)),
			new Txn(53123, 2000.00, TxnType.CREDIT, LocalDate.of(2018, 2, 12)),
			new Txn(73123, 6000.00, TxnType.DEBIT, LocalDate.of(2018, 1, 17)),
			new Txn(83123, 1000.00, TxnType.CREDIT, LocalDate.of(2018, 10, 12))

	);

	@Override
	public List<Txn> getTxns(double amount) {
//     Ï-----------------------------------------
		// way-1: imperative style ==> what + How
//		-----------------------------------------

//		List<Txn> out = new ArrayList<>();
//		for (Txn txn : allTxns) {
//			if (txn.getAmount() == amount)
//				out.add(txn);
//		}
//		return out;

//		-----------------------------------------
		// way-2 : declarative style
//		-----------------------------------------
//		// a. by Local Inner class
//		-----------------------------------------
//		class ByAmount implements Condition {
//			@Override
//			public boolean test(Txn txn) {
//				return txn.getAmount() == amount;
//			}
//		}
//		Condition byAmountCondition = new ByAmount();
//		return TxnUtilLib.filter(allTxns, byAmountCondition);

//		-----------------------------------------
//		// b. by Anonymous Inner class
//		-----------------------------------------
//		Condition byAmountCondition = new Condition() {
//			@Override
//			public boolean test(Txn txn) {
//				return txn.getAmount() == amount;
//			}
//		};
//		return TxnUtilLib.filter(allTxns, byAmountCondition);

//		-----------------------------------------
//		// b. by function
//		-----------------------------------------

		return TxnUtilLib.filter(allTxns, txn -> txn.getAmount() == amount);

		//----------------------------------------
	}

	@Override
	public List<Txn> getTxns(LocalDate date) {
		// imperative style ==> what + How
		List<Txn> out = new ArrayList<>();
		for (Txn txn : allTxns) {
			if (txn.getDate().equals(date))
				out.add(txn);
		}
		return out;
	}

	@Override
	public List<Txn> getTxns(LocalDate from, LocalDate to) {
		return null;
	}

}
