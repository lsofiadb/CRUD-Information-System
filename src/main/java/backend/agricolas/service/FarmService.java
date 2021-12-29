package backend.agricolas.service;

import backend.agricolas.model.Farm;
import backend.agricolas.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmService {
    @Autowired
    FarmRepository farmRepository;

    public Farm addNewFarm(Farm farm){
        return farmRepository.save(farm);
    }

    public Farm findFarmById(Long id){
        return farmRepository.findFarmById(id);
    }
}
