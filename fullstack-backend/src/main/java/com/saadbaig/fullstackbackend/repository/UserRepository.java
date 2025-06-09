package com.sohelbaig.fullstackbackend.repository;

import com.sohelbaig.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
