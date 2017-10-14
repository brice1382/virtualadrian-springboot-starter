package com.virtualadrian.base;

import com.virtualadrian.featuregroup.template.controller.TemplateController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



public class BaseController {
    public static final Logger logger = LoggerFactory.getLogger(TemplateController.class);

    protected ResponseEntity Ok(){
        return new ResponseEntity(HttpStatus.OK);
    }

    protected <T> ResponseEntity<T> Ok(T value){
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

    protected final Logger LOG = LoggerFactory.getLogger(this.getClass());    
}
