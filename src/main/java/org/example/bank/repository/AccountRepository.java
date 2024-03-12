package org.example.bank.repository;

import org.example.bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccountRepository extends JpaRepository<Account,Long>
{
    Account findAccountByName(String name);
    Account findAccountByLoginAndPassword(String log,String pas);
}
