package com.microservices.game.Repository;

import com.microservices.game.Entity.PlayerProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<PlayerProfile,String>, PagingAndSortingRepository<PlayerProfile,String> {
}
