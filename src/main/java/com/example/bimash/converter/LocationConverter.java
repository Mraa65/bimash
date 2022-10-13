package com.example.bimash.converter;

import com.example.bimash.constant.Location;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class LocationConverter implements AttributeConverter<Location, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Location location) {
        if (location == null) {
            return null;
        }
        return location.getId();
    }

    @Override
    public Location convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }

        return Stream.of(Location.values())
                .filter(location -> location.getId() == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
