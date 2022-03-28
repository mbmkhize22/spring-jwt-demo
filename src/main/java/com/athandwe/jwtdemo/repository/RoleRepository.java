package com.athandwe.jwtdemo.repository;

import com.athandwe.jwtdemo.models.ERole;
import com.athandwe.jwtdemo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
