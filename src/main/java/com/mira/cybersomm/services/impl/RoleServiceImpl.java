package com.mira.cybersomm.services.impl;

import com.mira.cybersomm.models.Role;
import com.mira.cybersomm.services.RoleService;
import com.mira.cybersomm.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public Role findRoleById(int id) {
        return roleRepository.findRoleById(id);
    }
}
