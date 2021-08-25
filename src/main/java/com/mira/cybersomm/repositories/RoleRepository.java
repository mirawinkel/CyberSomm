package com.mira.cybersomm.repositories;

import com.mira.cybersomm.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleById(int id);
    Role save(Role role);
}
