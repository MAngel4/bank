package org.example.bank.controller;

import lombok.RequiredArgsConstructor;
import org.example.bank.model.Account;
import org.example.bank.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequiredArgsConstructor
@Controller

public class AccountController {
    private final AccountService accountService;

    @GetMapping("/account/{id}")
    public Account GetAccountById(@PathVariable Long id) {
        return accountService.GetById(id);
    }

    @PostMapping("/account/create")
    public Account createaccount(@RequestBody Account account) {

        return accountService.CreateAccount(account);
    }

    @GetMapping("/account/list")
    public List<Account> list() {
        return accountService.getList();
    }

    @GetMapping("/account/name/{name}")
    public Account Name(@PathVariable String name) {
        return accountService.getAccountByName(name);
    }

    @PostMapping("/account/autonotification")
    public String autonotification(@RequestBody Account account)
    {
        return  accountService.getMoney(account);
    }

}

