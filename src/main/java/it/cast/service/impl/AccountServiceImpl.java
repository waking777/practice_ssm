package it.cast.service.impl;

import it.cast.dao.AccountDao;
import it.cast.domain.Account;
import it.cast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有的账户信息..");
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户..");
        accountDao.saveAccount(account);
    }
}
