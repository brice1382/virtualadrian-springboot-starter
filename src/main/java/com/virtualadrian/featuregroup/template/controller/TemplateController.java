package com.virtualadrian.featuregroup.template.controller;

import com.virtualadrian.base.BaseController;
import com.virtualadrian.featuregroup.template.model.TemplateModel;
import com.virtualadrian.featuregroup.template.service.TemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/template")
public class TemplateController extends BaseController {

    private TemplateService templateService;

    public TemplateController(TemplateService service){
        this.templateService = service;
    }

    @RequestMapping(value="/error",method = RequestMethod.GET)
    public String genError() throws Exception {
        throw new Exception("Test Exception Handler");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<TemplateModel>> getAll() {

        Iterable<TemplateModel> templates = templateService.findall(0,1);
        return Ok(templates);
    }

    @RequestMapping(value = "/{page}/{pageSize}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<TemplateModel>> getAll(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {
        Iterable<TemplateModel> templates = templateService.findall(page, pageSize);
        return Ok(templates);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<TemplateModel> get(@PathVariable("id") long id) {
        TemplateModel statEntry = templateService.find(id);
        return Ok(statEntry);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TemplateModel> create(@RequestBody final TemplateModel creating) {
        TemplateModel created = this.templateService.create(creating);
        return Ok(created);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<TemplateModel> update(@RequestBody final TemplateModel creating) {
        TemplateModel created = this.templateService.update(creating);
        return Ok(created);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable("id") long id) {
        this.templateService.delete(id);
        return Ok();
    }
}
