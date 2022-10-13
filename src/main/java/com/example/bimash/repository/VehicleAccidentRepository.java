package com.example.bimash.repository;

import com.example.bimash.entity.VehicleAccidentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleAccidentRepository extends CrudRepository<VehicleAccidentEntity,Long> {

    List<VehicleAccidentEntity> findByVin(String vin);
}
