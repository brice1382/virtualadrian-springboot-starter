package com.virtualadrian.featuregroup.account.repository;

import com.virtualadrian.featuregroup.account.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {


}
