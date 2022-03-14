package com.scotycode.car.VO;

import com.scotycode.car.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Car car;
    private CarShowroom carShowroom;

}
