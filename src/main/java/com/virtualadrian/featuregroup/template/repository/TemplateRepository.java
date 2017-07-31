package com.virtualadrian.featuregroup.template.repository;

import com.virtualadrian.featuregroup.template.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Quote repository.
 */
@Repository("templateRepository")
public interface TemplateRepository extends JpaRepository<TemplateEntity, Long> {


}
