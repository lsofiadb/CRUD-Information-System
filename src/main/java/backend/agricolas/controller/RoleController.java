package backend.agricolas.controller;

import backend.agricolas.model.Role;
import backend.agricolas.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roleController")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("/addNewRole")
    public Role addNewRole(@RequestBody Role role){
        return roleService.addNewRole(role);
    }

}
