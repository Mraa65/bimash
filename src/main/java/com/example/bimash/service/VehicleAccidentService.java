package com.example.bimash.service;

import com.example.bimash.entity.VehicleAccidentEntity;
import com.example.bimash.repository.VehicleAccidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleAccidentService {
    private final VehicleAccidentRepository vehicleAccidentRepository;

    public List<VehicleAccidentEntity> getAccidents(String vin) {
        return vehicleAccidentRepository.findByVin(vin);
    }

    public VehicleAccidentEntity getAccident(Long id) {
        return vehicleAccidentRepository.findById(id).orElse(null);
    }
}
