package backend.agricolas.controller;

import backend.agricolas.model.Person;
import backend.agricolas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personController")
public class PersonController {
    @Autowired
    public PersonService personService;

    @PostMapping("/addNewPerson")
    public Person addNewPerson(@RequestBody Person person) {
        return personService.addNewPerson(person);
    }

}
