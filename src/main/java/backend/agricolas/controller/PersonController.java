package backend.agricolas.controller;

import backend.agricolas.dto.PersonDto;
import backend.agricolas.model.Person;
import backend.agricolas.service.PersonService;
import backend.agricolas.service.RoleService;
import backend.agricolas.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personController")
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private RoleService roleService;

    @PostMapping("/addNewPerson")
    public Person addNewPerson(@RequestBody PersonDto personDto) {
        Utils utils = new Utils();
        personDto.setPassword(utils.getEncodedPassword(personDto.getPassword()));
        Person person = personDto.getPerson(personDto);
        person.setRole(roleService.findRoleById(personDto.getRole_id()));
        return personService.addNewPerson(person);
    }

    @DeleteMapping("/deletePersonByCC/{cc}")
    public void deletePersonByCC(@PathVariable Long cc) {
        personService.deletePersonByCC(cc);
    }

    @GetMapping("/getAllPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PutMapping("/updatePerson")
    public Person updatePerson(@RequestBody PersonDto personDto) {
        Utils utils = new Utils();
        personDto.setPassword(utils.getEncodedPassword(personDto.getPassword()));
        Person person = personDto.getPerson(personDto);
        person.setRole(roleService.findRoleById(personDto.getRole_id()));
        return personService.updatePerson(person);
    }

    @GetMapping("/findPersonByCC/{cc}")
    public Person findPersonByCC(@PathVariable Long cc) {
        return personService.findPersonByCC(cc);
    }

    @GetMapping("/findPersonsByRole/{role_id}")
    public List<Person> findPersonByRole(@PathVariable Long role_id){
       return personService.findPersonByRole(roleService.findRoleById(role_id));
    }
}