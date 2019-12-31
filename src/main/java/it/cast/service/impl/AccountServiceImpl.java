package it.cast.service.impl;

import it.cast.domain.Account;
import it.cast.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<String> findAll() {
        System.out.println("业务层：查询所有的账户信息..");
        return null;

    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户..");
    }
}
