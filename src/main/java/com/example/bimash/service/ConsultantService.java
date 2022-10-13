package com.example.bimash.service;

import com.example.bimash.constant.Location;
import com.example.bimash.constant.Skill;
import com.example.bimash.entity.VehicleAccidentEntity;
import com.example.bimash.entity.ConsultantEntity;
import com.example.bimash.repository.ConsultantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultantService {
    private final ConsultantRepository consultantRepository;

    public List<ConsultantEntity> getConsultants(List<VehicleAccidentEntity> accidentEntities, Integer locationId) {
        List<ConsultantEntity> consultants = new ArrayList<>();
        if (locationId != null) {
            for (VehicleAccidentEntity vehicleAccidentEntity : accidentEntities) {
                if (consultants.stream().noneMatch(c ->
                        (c.getSkill().getId() == vehicleAccidentEntity.getDamageTypeId() &&
                                c.getLocation().getId() == locationId))) {
                    consultants.add(consultantRepository.findBySkillAndLocation(
                            Skill.of(vehicleAccidentEntity.getDamageTypeId()),
                            Location.of(locationId)).get(0));
                }
            }
            consultants.add(consultantRepository.findBySkillAndLocation(Skill.TEST,
                    Location.of(locationId)).get(0));
        } else {
            for (VehicleAccidentEntity vehicleAccidentEntity : accidentEntities) {
                if (consultants.stream().noneMatch(c -> c.getSkill().getId() == vehicleAccidentEntity.getDamageTypeId())) {
                    consultants.add(consultantRepository.findBySkillAndLocation(
                            Skill.of(vehicleAccidentEntity.getDamageTypeId()), Location.CENTER).get(0));
                }
            }
            consultants.add(consultantRepository.findBySkillAndLocation(Skill.TEST, Location.CENTER).get(0));
        }
        return consultants;
    }

}
