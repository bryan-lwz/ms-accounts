package com.mbb.account.service;

import com.mbb.account.model.AccountDAO;
import com.mbb.account.model.response.CreateAccountResponse;
import com.mbb.account.model.response.GetAccountListResponse;

public interface AccountService {

    GetAccountListResponse getAccountList();

    GetAccountListResponse getAccountListWithPageCount(Integer page, Integer totalRecord);

    CreateAccountResponse createAccount(AccountDAO account);

}
