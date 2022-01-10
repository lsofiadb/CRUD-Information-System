package backend.agricolas.repository;

import backend.agricolas.model.Person;
import backend.agricolas.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
    public Person findPersonByCc(Long cc);
    public void deletePersonByCc(Long cc);
    public List<Person> findPersonByRole(Role role);
}
