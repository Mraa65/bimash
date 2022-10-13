package com.example.bimash.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleAccidentDTO {
    private Long id;
    private String vin;
    private String role;
    private String accidentDate;
    private String accidentReason;
    private String vehicleModel;
    private String plateNumber;
    private String damagePosition;
    private String damagedAccessories;
}
