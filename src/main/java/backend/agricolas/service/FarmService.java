package backend.agricolas.service;

import backend.agricolas.model.Farm;
import backend.agricolas.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


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

    public Optional<Farm> findById(Long id){
        return farmRepository.findById(id);
    }

    public boolean existsById(Long id){
        return farmRepository.existsById(id);
    }

    public List<Farm> findAllFarms(){
        return farmRepository.findAll();
    }

    public void deleteFarmById(Long id){
        farmRepository.deleteById(id);
    }

    public Farm updateFarm(Farm farm){
        return farmRepository.save(farm);
    }

    public Farm updateFarmImageURL(Long id, String imageURL){
        Farm farm = farmRepository.findFarmById(id);
        farm.setUrl_image(imageURL);
        farmRepository.save(farm);
        return farm;
        }
}
