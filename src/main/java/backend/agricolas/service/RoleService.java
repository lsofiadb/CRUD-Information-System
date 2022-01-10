package backend.agricolas.service;

import backend.agricolas.model.Role;
import backend.agricolas.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role addNewRole(Role role){
        return roleRepository.save(role);
    }

    public Role findRoleById(Long id){
        return roleRepository.findRoleById(id);
    }

    public void deleteRoleById(Long id){
        roleRepository.deleteById(id);
    }

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Role updateRole(Role role){
        return roleRepository.save(role);
    }
}
