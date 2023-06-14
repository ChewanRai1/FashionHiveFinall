package com.system.Fashionhive.repo;

import com.system.Fashionhive.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//user ko repository
//user repo
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery = true)
    Optional<User> findByEmail(String email);
}
