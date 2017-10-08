package com.virtualadrian.auth.repository;

import com.virtualadrian.auth.authuser.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author saka7
 * Provides basic CURD operations with User entity
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    /**
     * Finds user by email
     * @param email to look for
     * @return user by given email
     */
    User findByEmail(String email);

    /**
     * Finds user by name
     * @param name to look for
     * @return user by given name
     */
    User findByName(String name);
}
