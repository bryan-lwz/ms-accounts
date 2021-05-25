package com.mbb.account.service.impl;

import com.mbb.account.model.response.GetAccountListResponse;
import com.mbb.account.repository.AccountRepository;
import com.mbb.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    public GetAccountListResponse getAccountList() {
        GetAccountListResponse response = new GetAccountListResponse();
        response.setAccountList(new ArrayList(accountRepository.findAll()));
        return response;
    }

}
