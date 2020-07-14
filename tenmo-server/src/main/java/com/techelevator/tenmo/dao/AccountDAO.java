package com.techelevator.tenmo.dao;


import com.techelevator.tenmo.model.Account;

public interface AccountDAO {

	void updateBalance(Account account);

	Account getAccountByUserId(Long userId);
}
