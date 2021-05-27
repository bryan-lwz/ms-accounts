package com.mbb.account.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccountDAO {

    private Integer id;
    private String accountNo;
    private String accountHolderName; // usually should link to another table, in this case, just set as string here.

}
