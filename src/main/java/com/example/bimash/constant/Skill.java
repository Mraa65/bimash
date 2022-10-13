package com.example.bimash.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum Skill {
    BODY(1, "رنگ و بدنه"),
    MOTOR(2, "جلوبندی"),
    TEST(3, "دیاگ و تست");

    private final int id;
    private final String title;

    public static Skill of(int id) {
        return Arrays.stream(values())
                .filter(skill -> id == skill.getId())
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
