package com.virtualadrian.featuregroup.template.service;

import com.virtualadrian.base.BaseCrudService;
import com.virtualadrian.featuregroup.template.entity.TemplateEntity;
import com.virtualadrian.featuregroup.template.model.TemplateModel;
import org.springframework.stereotype.Service;

@Service
public class TemplateService extends BaseCrudService<TemplateModel, TemplateEntity, Long>  {

    public TemplateService() {
        super(TemplateModel.class, TemplateEntity.class);
    }

}
