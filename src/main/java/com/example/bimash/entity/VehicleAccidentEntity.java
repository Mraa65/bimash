package com.example.bimash.entity;

import com.example.bimash.converter.JsonStringListConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "vehicle_accident")
public class VehicleAccidentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String vin;

    @Column(name = "damage_type_id")
    private Integer damageTypeId;

    @Column(name = "at_fault")
    private boolean atFault;

    @Column(name = "accident_date")
    private String accidentDate;

    @Column(name = "accident_reason")
    private String accidentReason;

    @Column(name = "vehicle_model")
    private String vehicleModel;

    @Column(name = "plate_number")
    private String plateNumber;

    @Column(name = "damage_position")
    private String damagePosition;

    @Column(name = "damaged_accessories", columnDefinition = "json")
    @Convert(converter = JsonStringListConverter.class)
    private List<String> damagedAccessories;

    @Lob
    private byte[] image;

}
