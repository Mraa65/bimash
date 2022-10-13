package com.example.bimash.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Location {
    NORTH(1, "شمال تهران"),
    SOUTH(2, "جنوب تهران"),
    WEST(3, "غرب تهران"),
    EAST(4, "شرق تهران"),
    CENTER(5, "مرکز تهران");

    private final int id;
    private final String title;

    public static Location of(int id) {
        return Arrays.stream(values())
                .filter(location -> id == location.getId())
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
