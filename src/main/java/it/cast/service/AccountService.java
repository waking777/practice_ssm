package it.cast.service;

import it.cast.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有账户信息
    public List<String> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
