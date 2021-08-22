package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleById(int id);
}
