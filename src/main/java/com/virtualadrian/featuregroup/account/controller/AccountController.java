package com.virtualadrian.featuregroup.account.controller;

import com.virtualadrian.base.BaseController;
import com.virtualadrian.featuregroup.account.model.AccountModel;
import com.virtualadrian.featuregroup.account.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {

    private AccountService accountService;

    public AccountController(AccountService service)
    {
        this.accountService = service;
    }

    @RequestMapping(value="/error",method = RequestMethod.GET)
    public String genError() throws Exception {
        throw new Exception("Test Exception Handler");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<AccountModel>> getAll() {

        Iterable<AccountModel> templates = accountService.findall(0, 1);
        return Ok(templates);
    }

    @RequestMapping(value = "/{page}/{pageSize}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<AccountModel>> getAll(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {
        Iterable<AccountModel> templates = accountService.findall(page, pageSize);
        return Ok(templates);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AccountModel> get(@PathVariable("id") long id) {
        AccountModel statEntry = accountService.find(id);
        return Ok(statEntry);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<AccountModel> create(@RequestBody final AccountModel creating) {
        AccountModel created = this.accountService.create(creating);
        return Ok(created);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<AccountModel> update(@RequestBody final AccountModel creating) {
        AccountModel created = this.accountService.update(creating);
        return Ok(created);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable("id") long id) {
        this.accountService.delete(id);
        return Ok();
    }
}
