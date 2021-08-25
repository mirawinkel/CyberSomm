package com.mira.cybersomm.services;

import com.mira.cybersomm.models.Role;

public interface RoleService {
    Role findRoleById(int id);
    Role save(Role role);
}
