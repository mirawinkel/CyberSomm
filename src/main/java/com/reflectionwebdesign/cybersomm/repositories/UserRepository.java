package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer > {

    User findUserByEmail(String email);
    User findUserByName(String name);
    void deleteUserByEmail(String email);

}
