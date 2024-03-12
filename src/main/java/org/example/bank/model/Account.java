package org.example.bank.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "account")
@Data
public class Account {
    private String login;
    private String password;
    private double money;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String phone;
    private String name;
    private String surname;
}