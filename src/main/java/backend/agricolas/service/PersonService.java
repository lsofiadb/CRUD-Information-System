package backend.agricolas.service;

import backend.agricolas.model.Person;
import backend.agricolas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person addNewPerson(Person person){
        return personRepository.save(person);
    }

    public Person findPersonByCC(Long cc){
        return personRepository.findPersonByCc(cc);
    }

    public void deletePersonByCC(Long cc){
        personRepository.deleteById(cc);
    }

    public Person updatePerson(Person person){
        return personRepository.save(person);
    }

    public List <Person> getAllPersons(){
        List <Person> personList = new ArrayList<>();
        personList = personRepository.findAll();
        return personList;
    }
}
