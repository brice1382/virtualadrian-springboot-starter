package com.virtualadrian.featuregroup.template.controller;

import com.virtualadrian.featuregroup.template.contract.ITemplateService;
import com.virtualadrian.featuregroup.template.model.TemplateModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type Stats controller.
 */
@RestController("templateController")
@RequestMapping("/template")
public class TemplateController {

    /**
     * The constant logger.
     */
    public static final Logger logger = LoggerFactory.getLogger(TemplateController.class);

    /**
     * The Stats service.
     */
    @Autowired
    ITemplateService templateService;

    /**
     * Gets all.
     *
     * @return the allweb
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<TemplateModel>> getAll() {

        // tap service for list of company
        Iterable<TemplateModel> templates = templateService.findall(0,1);

        // respond to caller with 200 always - could be a 404 if they prefer
        return new ResponseEntity(templates, HttpStatus.OK);
    }

    /**
     * Gets all.
     *
     * @return the allweb
     */
    @RequestMapping(value = "/{page}/{pageSize}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<TemplateModel>> getAll(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {

        // tap service for list of company
        Iterable<TemplateModel> templates = templateService.findall(page, pageSize);

        // respond to caller with 200 always - could be a 404 if they prefer
        return new ResponseEntity(templates, HttpStatus.OK);
    }

    /**
     * Get response repository.
     *
     * @param id the id
     * @return the response repository
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<TemplateModel> get(@PathVariable("id") long id) {
        // tap service for specific stat entry
        TemplateModel statEntry = templateService.find(id);
        // respond to caller with 200 always - could be a 404 if they prefer
        return new ResponseEntity(statEntry, HttpStatus.OK);
    }

    /**
     * Create response repository.
     *
     * @param creating the creating
     * @return the response repository
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TemplateModel> create(@RequestBody final TemplateModel creating) {
        // tap service for list of company
        TemplateModel created = this.templateService.create(creating);
        return new ResponseEntity(created, HttpStatus.OK);
    }

    /**
     * Update response repository.
     *
     * @param creating the creating
     * @return the response repository
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<TemplateModel> update(@RequestBody final TemplateModel creating) {
        // tap service for list of company
        TemplateModel created = this.templateService.update(creating);
        return new ResponseEntity(created, HttpStatus.OK);
    }

    /**
     * Delete response repository.
     *
     * @param id the id
     * @return the response repository
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<TemplateModel> delete(@PathVariable("id") long id) {
        this.templateService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
