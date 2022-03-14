package com.scotycode.carshowroomservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarShowroom {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carShowroomId;
    private String carShowroomName;
    private String carShowroomStreet;
    private String carShowroomAddresCode;


}
