package com.scotycode.car.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarShowroom {

    private Long carShowroomId;
    private String carShowroomName;
    private String carShowroomStreet;
    private String carShowroomAddresCode;
}
