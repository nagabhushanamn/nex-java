package com.bank.lib;

import com.bank.model.Txn;

public interface Condition {
	boolean test(Txn txn);

}
