package com.tnd.authorize.repositories;

import com.tnd.authorize.domain.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
