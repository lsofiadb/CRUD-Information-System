package backend.agricolas.dto;

import backend.agricolas.model.Person;
import backend.agricolas.service.RoleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class PersonDto {
    private Long cc;
    private String name;
    private String surname;
    private Long cellphone;
    private String email;
    private String password;
    private Long role_id;

    public Person getPerson(PersonDto personDto){
        Person person = new Person();
        person.setCc(personDto.getCc());
        person.setName(personDto.getName());
        person.setSurname(personDto.getSurname());
        person.setCellphone(personDto.getCellphone());
        person.setEmail(personDto.getEmail());
        person.setPassword(personDto.getPassword());
        return person;
    }
}
