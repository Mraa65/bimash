package com.example.bimash.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultantDTO {
    private String fullName;
    private String skillTitle;
    private String location;
    private String phoneNumber;
}
