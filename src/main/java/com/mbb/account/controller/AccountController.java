package com.mbb.account.controller;

import com.mbb.account.model.response.GetAccountListResponse;
import com.mbb.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public GetAccountListResponse getAccountList() {
        return accountService.getAccountList();
    }

}
