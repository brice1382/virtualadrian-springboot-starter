package com.virtualadrian.featuregroup.serverstats.repository;

import com.virtualadrian.featuregroup.serverstats.entity.ServerStatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerStatsRepository extends JpaRepository<ServerStatsEntity, Long> {

}
