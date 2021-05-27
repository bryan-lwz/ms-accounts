package com.mbb.account.repository;

import com.mbb.account.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountPaginationRepository extends PagingAndSortingRepository<Account, Integer> {

    Page<Account> findAll(Pageable pageable);

}
