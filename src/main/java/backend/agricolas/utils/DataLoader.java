package backend.agricolas.utils;

import backend.agricolas.model.Person;
import backend.agricolas.model.Role;
import backend.agricolas.service.PersonService;
import backend.agricolas.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    PersonService personService;

    @Autowired
    RoleService roleService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /*-------------------------role------------------------*/
        /*
        roleService.addNewRole(new Role(2L,"agricultor"));
        roleService.addNewRole(new Role(3L,"administrador"));
        */
        /*-------------------------users------------------------*/
        /*
        personService.addNewPerson(new Person(12345L,"Alberto","Martinez",456789L,"albertomar@gmail.com","asd",new Role(1L,"cliente")));
         */

    }
}
