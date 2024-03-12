package org.example.bank.service;

import lombok.RequiredArgsConstructor;
import org.example.bank.model.Account;
import org.example.bank.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public Account GetById(Long id) {
        return accountRepository.findById(id).get();
    }

    public Account CreateAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> getList() {
        return accountRepository.findAll();
    }

    public Account getAccountByName(String name) {
        return accountRepository.findAccountByName(name);
    }

    public String getMoney(Account account) {
        return String.valueOf(accountRepository.findAccountByLoginAndPassword(account.getLogin(), account.getPassword()).getMoney());
    }


}
