package com.virtualadrian.featuregroup.serverstats.service;

import com.virtualadrian.base.BaseCrudService;
import com.virtualadrian.featuregroup.serverstats.entity.ServerStatsEntity;
import com.virtualadrian.featuregroup.serverstats.model.ServerStatsModel;
import org.springframework.stereotype.Service;

@Service
public class ServerStatsService extends BaseCrudService<ServerStatsModel, ServerStatsEntity, Long> {

    public ServerStatsService() {
        super(ServerStatsModel.class, ServerStatsEntity.class);
    }

}
