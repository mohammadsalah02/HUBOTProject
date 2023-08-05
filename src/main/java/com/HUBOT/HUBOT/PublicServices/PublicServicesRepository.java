package com.HUBOT.HUBOT.PublicServices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicServicesRepository extends MongoRepository<PublicServices, String> {

    // Custom queries for filtering public services
    List<PublicServices> findByBuildingId(String buildingId);

    List<PublicServices> findByTypeOfService(String typeOfService);

    List<PublicServices> findByPublicServicePlaceName(String publicServicePlaceName);
}
