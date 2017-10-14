package com.virtualadrian.featuregroup.serverstats.controller;

import com.virtualadrian.base.BaseController;
import com.virtualadrian.featuregroup.serverstats.model.ServerStatsModel;
import com.virtualadrian.featuregroup.serverstats.service.ServerStatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/serverstats")
public class ServerStatsController extends BaseController {

  private ServerStatsService serverStatsService;

  public ServerStatsController(ServerStatsService service) {
    this.serverStatsService = service;
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Iterable<ServerStatsModel>> findAll() {
    Iterable<ServerStatsModel> allServerStats = this.serverStatsService.findall(0, 100);
    return Ok(allServerStats);
  }

  @RequestMapping(value = "/{page}/{pageSize}", method = RequestMethod.GET)
  public ResponseEntity<Iterable<ServerStatsModel>> findAll(@PathVariable("page") final Integer page, @PathVariable("pageSize") final Integer pageSize) {
    Iterable<ServerStatsModel> allServerStats = this.serverStatsService.findall(page, pageSize);
    return Ok(allServerStats);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<ServerStatsModel> get(@PathVariable("id") final Long id) {
    ServerStatsModel entry = this.serverStatsService.find(id);
    return Ok(entry);
  }

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<ServerStatsModel> create(@RequestBody final ServerStatsModel creating) {
    ServerStatsModel created = this.serverStatsService.create(creating);
    return Ok(created);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public ResponseEntity<ServerStatsModel> update(@RequestBody final ServerStatsModel updating) {
    ServerStatsModel updated = this.serverStatsService.update(updating);
    return Ok(updated);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public ResponseEntity delete(@PathVariable("id") final Long id) {
    this.serverStatsService.delete(id);
    return Ok();
  }
}
