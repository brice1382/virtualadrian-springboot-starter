package com.virtualadrian.featuregroup.company.service;

import com.virtualadrian.base.BaseCrudService;
import com.virtualadrian.featuregroup.company.entity.CompanyEntity;
import com.virtualadrian.featuregroup.company.model.CompanyModel;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends BaseCrudService<CompanyModel, CompanyEntity, Long>  {

    public CompanyService() {
        super(CompanyModel.class, CompanyEntity.class);
    }

}
