package com.example.bimash.repository;

import com.example.bimash.constant.Location;
import com.example.bimash.constant.Skill;
import com.example.bimash.entity.ConsultantEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConsultantRepository extends CrudRepository<ConsultantEntity,Long> {

    List<ConsultantEntity> findBySkillAndLocation(Skill skill, Location location);
}
