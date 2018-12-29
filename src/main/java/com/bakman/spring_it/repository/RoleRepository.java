package com.bakman.spring_it.repository;

import com.bakman.spring_it.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
