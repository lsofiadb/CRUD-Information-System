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
        System.out.println("-----------EL ROL ES----------------------"+personDto.getRole_id());
        Utils utils = new Utils();
        personDto.setPassword(utils.getEncodedPassword(personDto.getPassword()));
        Person person = personDto.getPerson(personDto);
        person.setRole(roleService.findRoleById(personDto.getRole_id()));
        return personService.addNewPerson(person);
    }

    @DeleteMapping("/deletePersonByCC/{cc}")
    public void deletePersonByCC(@PathVariable Long cc){
        personService.deletePersonByCC(cc);
    }

    @GetMapping("/getAllPersons")
    public List <Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @PutMapping("/updatePerson")
    public Person updatePerson(@RequestBody PersonDto personDto){
        return addNewPerson(personDto);
    }

    @GetMapping("/findPersonByCC/{cc}")
    public Person findPersonByCC(@PathVariable Long cc){
        return personService.findPersonByCC(cc);
    }
}