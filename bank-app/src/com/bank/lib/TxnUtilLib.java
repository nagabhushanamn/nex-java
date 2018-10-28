package com.bank.lib;

import java.util.ArrayList;
import java.util.List;

import com.bank.model.Txn;


public class TxnUtilLib {

	public static List<Txn> filter(List<Txn> txns, Condition condition) {
		List<Txn> out = new ArrayList<>();
		for (Txn txn : txns) {
			if (condition.test(txn))
				out.add(txn);
		}
		return out;
	}

}
