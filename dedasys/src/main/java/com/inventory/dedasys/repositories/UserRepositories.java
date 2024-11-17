package com.inventory.dedasys.repositories;

import com.inventory.dedasys.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositories extends CrudRepository<User, Integer> {
}
