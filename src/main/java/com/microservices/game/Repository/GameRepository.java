package com.microservices.game.Repository;

import com.microservices.game.Entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends MongoRepository<Game,String>, PagingAndSortingRepository<Game,String> {
}
