package com.example.bimash.entity;

import com.example.bimash.constant.Location;
import com.example.bimash.constant.Skill;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "consultant")
public class ConsultantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Skill skill;

    private Location location;

    @Column(name = "phone_number")
    private String phoneNumber;

}
