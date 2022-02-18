package nvc.it.ice_factory_jakrit.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_jakrit.model.Camera;

public interface CameraRepository extends MongoRepository<Camera, String>{
    
    public List<Camera> findByNameContaining(String name);

    

}
