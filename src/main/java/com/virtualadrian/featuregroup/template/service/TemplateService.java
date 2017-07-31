package com.virtualadrian.featuregroup.template.service;

import com.virtualadrian.base.BaseCrudService;
import com.virtualadrian.featuregroup.template.contract.ITemplateService;
import com.virtualadrian.featuregroup.template.entity.TemplateEntity;
import com.virtualadrian.featuregroup.template.model.TemplateModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The type quote service.
 */
@Service("templateService")
@Transactional
public class TemplateService extends BaseCrudService<TemplateModel, TemplateEntity, Long> implements ITemplateService {

    /**
     * Instantiates a new Stats service.
     */
    public TemplateService() {
        super(TemplateModel.class, TemplateEntity.class);
    }

}
