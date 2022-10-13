package com.example.bimash.converter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Converter
public class JsonStringListConverter implements AttributeConverter<List<Object>, String> {
    private static final ObjectMapper mapper;

    static {
        // To avoid instantiating ObjectMapper again and again.
        mapper = new ObjectMapper();
    }

    @Override
    public String convertToDatabaseColumn(List<Object> data) {
        if (null == data) {
            // You may return null if you prefer that style
            return null;
        }

        try {
            return mapper.writeValueAsString(data);

        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting list to JSON", e);
        }
    }

    @Override
    public List<Object> convertToEntityAttribute(String s) {
        if (null == s) {
            // You may return null if you prefer that style
            return new ArrayList<>();
        }

        try {
            return mapper.readValue(s, new TypeReference<List<Object>>() {
            });

        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting JSON to list", e);
        }
    }
}
