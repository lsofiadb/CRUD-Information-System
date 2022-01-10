package backend.agricolas.controller;

import backend.agricolas.model.Role;
import backend.agricolas.service.PersonService;
import backend.agricolas.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roleController")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @Autowired
    private PersonService personService;

    @PostMapping("/addNewRole")
    public Role addNewRole(@RequestBody Role role){
        return roleService.addNewRole(role);
    }

    @GetMapping("/getRoleById/{id}")
    public Role getRoleById(@PathVariable Long id){
        return roleService.findRoleById(id);
    }

    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @PutMapping("/updateRole")
    public Role updateRole(@RequestBody Role role){
        return roleService.updateRole(role);
    }

    @DeleteMapping("/deleteRoleById/{id}")
    public void deleteRoleById(@PathVariable Long id){
        personService.deletePersonsByRole(roleService.findRoleById(id));
        roleService.deleteRoleById(id);
    }
}
