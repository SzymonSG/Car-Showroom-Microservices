package com.scotycode.car.service;

import com.scotycode.car.VO.ResponseTemplateVO;
import com.scotycode.car.entity.Car;

public interface CarService {
    Car saveCar(Car car);

    ResponseTemplateVO getCarFromCarShowroom(Long carId);
}
