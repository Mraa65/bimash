package com.example.bimash.mapper;

import com.example.bimash.constant.Skill;
import com.example.bimash.dto.VehicleAccidentDTO;
import com.example.bimash.entity.VehicleAccidentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", imports = {Skill.class})
public interface VehicleAccidentMapper {

    @Mapping(target = "role", expression = "java(entity.isAtFault() ? \"مقصر\" : \"زیان دیده\")")
    @Mapping(target = "damagedAccessories", expression = "java(String.join(\",\", entity.getDamagedAccessories()))")
    VehicleAccidentDTO toDTO(VehicleAccidentEntity entity);

    List<VehicleAccidentDTO> toDTOs(List<VehicleAccidentEntity> entity);
}
