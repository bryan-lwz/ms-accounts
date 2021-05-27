package com.mbb.account.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT")
@Getter
@Setter
public class Account {

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id")
    private int id;
    @Column(name="account_no")
    private String accountNumber;
    @Column(name="account_holder_name")
    private String accountHolderName;

}
