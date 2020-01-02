package it.cast.controller;

import it.cast.domain.Account;
import it.cast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService as;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户");
        List<Account> list = as.findAll();
        model.addAttribute("list",list);
        return "list";
    }

}
