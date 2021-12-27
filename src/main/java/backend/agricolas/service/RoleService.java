package backend.agricolas.service;

import backend.agricolas.model.Role;
import backend.agricolas.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role addNewRole(Role role){
        return roleRepository.save(role);
    }
}
