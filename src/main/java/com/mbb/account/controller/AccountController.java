package com.mbb.account.controller;

import com.mbb.account.entity.Account;
import com.mbb.account.model.AccountDAO;
import com.mbb.account.model.response.CreateAccountResponse;
import com.mbb.account.model.response.GetAccountListResponse;
import com.mbb.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/retrieve")
    public GetAccountListResponse getAccountList() {
        return accountService.getAccountList();
    }

    @GetMapping("/retrieve/page")
    public GetAccountListResponse getAccountPaginatedList(Integer page, Integer totalRecord) { return accountService.getAccountListWithPageCount(page, totalRecord); }

    @PostMapping("/create")
    public CreateAccountResponse createAccount(@RequestBody AccountDAO account) { return accountService.createAccount(account); }

}
