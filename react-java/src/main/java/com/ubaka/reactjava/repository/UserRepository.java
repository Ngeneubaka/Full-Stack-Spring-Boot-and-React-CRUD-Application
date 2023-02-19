package com.ubaka.reactjava.repository;

import com.ubaka.reactjava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
