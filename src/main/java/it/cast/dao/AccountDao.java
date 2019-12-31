package it.cast.dao;

import it.cast.domain.Account;

import java.util.List;

/**
 * 账户dao接口
 */
public interface AccountDao {

    //查询所有账户信息
    public List<String> findAll();

    //保存账户信息
    public void saveAccount(Account account);


}
