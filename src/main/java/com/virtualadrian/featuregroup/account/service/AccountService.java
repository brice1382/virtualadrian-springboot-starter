package com.virtualadrian.featuregroup.account.service;

import com.virtualadrian.base.BaseCrudService;
import com.virtualadrian.featuregroup.account.entity.AccountEntity;
import com.virtualadrian.featuregroup.account.model.AccountModel;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends BaseCrudService<AccountModel, AccountEntity, Long>  {

    public AccountService() {
        super(AccountModel.class, AccountEntity.class);
    }

}
