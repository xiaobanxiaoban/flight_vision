package com.ban.flight.service.repository;

import com.ban.flight.service.document.Adsb;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xiaoban on 2016/11/21.
 */
public interface AdsbRepository extends MongoRepository<Adsb, String> {
}
