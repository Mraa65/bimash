package com.example.bimash.converter;

import com.example.bimash.constant.Skill;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class SkillConverter implements AttributeConverter<Skill, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Skill skill) {
        if (skill == null) {
            return null;
        }
        return skill.getId();
    }

    @Override
    public Skill convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }

        return Stream.of(Skill.values())
                .filter(skill -> skill.getId() == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
