package com.virtualadrian.featuregroup.company.controller;

import com.virtualadrian.base.BaseController;
import com.virtualadrian.featuregroup.company.model.CompanyModel;
import com.virtualadrian.featuregroup.company.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController extends BaseController {

  private CompanyService companyService;

  public CompanyController(CompanyService service) {
    this.companyService = service;
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Iterable<CompanyModel>> findAll() {
    Iterable<CompanyModel> allCompany = this.companyService.findall(0, 100);
    return Ok(allCompany);
  }

  @RequestMapping(value = "/{page}/{pageSize}", method = RequestMethod.GET)
  public ResponseEntity<Iterable<CompanyModel>> findAll(@PathVariable("page") final Integer page, @PathVariable("pageSize") final Integer pageSize) {
    Iterable<CompanyModel> allCompany = this.companyService.findall(page, pageSize);
    return Ok(allCompany);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<CompanyModel> get(@PathVariable("id") final Long id) {
    CompanyModel entry = this.companyService.find(id);
    return Ok(entry);
  }

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<CompanyModel> create(@RequestBody final CompanyModel creating) {
    CompanyModel created = this.companyService.create(creating);
    return Ok(created);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public ResponseEntity<CompanyModel> update(@RequestBody final CompanyModel updating) {
    CompanyModel updated = this.companyService.update(updating);
    return Ok(updated);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public ResponseEntity delete(@PathVariable("id") final Long id) {
    this.companyService.delete(id);
    return Ok();
  }
}
