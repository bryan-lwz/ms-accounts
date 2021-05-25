package com.mbb.account.model.response;

import com.mbb.account.entity.Account;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetAccountListResponse {

    private List<Account> accountList;

}
