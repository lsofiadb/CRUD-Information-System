package backend.agricolas.service;

import backend.agricolas.model.Person;
import backend.agricolas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
