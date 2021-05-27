package com.mbb.account.service.impl;

import com.mbb.account.entity.Account;
import com.mbb.account.model.AccountDAO;
import com.mbb.account.model.response.CreateAccountResponse;
import com.mbb.account.model.response.GetAccountListResponse;
import com.mbb.account.repository.AccountPaginationRepository;
import com.mbb.account.repository.AccountRepository;
import com.mbb.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountPaginationRepository accountPaginationRepository;

    @Transactional
    public GetAccountListResponse getAccountList() {
        GetAccountListResponse response = new GetAccountListResponse();
        response.setAccountList(new ArrayList(accountRepository.findAll()));
        return response;
    }

    @Transactional
    public GetAccountListResponse getAccountListWithPageCount(Integer page, Integer totalRecord) {
        GetAccountListResponse response = new GetAccountListResponse();
        PageRequest pageRequest = PageRequest.of(page, totalRecord);
        Page<Account> accounts = accountPaginationRepository.findAll(pageRequest);

        if (accounts.hasContent()) {
            response.setAccountList(accounts.getContent());
        }

        return response;
    }

    @Transactional
    public CreateAccountResponse createAccount(AccountDAO accountDAO) {
        log.debug(accountDAO.toString());
        CreateAccountResponse response = new CreateAccountResponse();

        Account account = new Account();
        account.setAccountNumber(accountDAO.getAccountNo());
        account.setAccountHolderName(accountDAO.getAccountHolderName());

        Account createdAccount = accountRepository.save(account);
        response.setAccount(createdAccount);

        return response;
    }

}
