package backend.agricolas.repository;

import backend.agricolas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
    public Person findPersonByCc(Long cc);
    public void deletePersonByCc(Long cc);

}
