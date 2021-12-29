package backend.agricolas.repository;

import backend.agricolas.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository<Farm,Long> {
    public Farm findFarmById(Long id);
}
