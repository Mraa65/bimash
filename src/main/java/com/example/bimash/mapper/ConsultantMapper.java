package com.example.bimash.mapper;

import com.example.bimash.constant.Location;
import com.example.bimash.constant.Skill;
import com.example.bimash.dto.ConsultantDTO;
import com.example.bimash.entity.ConsultantEntity;
import org.apache.tomcat.util.buf.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Arrays;
import java.util.List;

@Mapper(componentModel = "spring", imports = {Skill.class, Location.class, StringUtils.class, Arrays.class})
public interface ConsultantMapper {

    @Mapping(target = "fullName", expression = "java(StringUtils.join(Arrays.asList(" +
            "entity.getFirstName(),entity.getLastName()), ' '))")
    @Mapping(target = "skillTitle", expression = "java(StringUtils.join(Arrays.asList(" +
            "\"کارشناس\"," +
            "entity.getSkill().getTitle()), ' '))")
    @Mapping(target = "location", expression = "java(entity.getLocation().getTitle())")
    ConsultantDTO toDTO(ConsultantEntity entity);

    List<ConsultantDTO> toDTOs(List<ConsultantEntity> entity);
}
