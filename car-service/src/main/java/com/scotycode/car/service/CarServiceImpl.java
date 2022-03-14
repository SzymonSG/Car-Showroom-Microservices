package com.scotycode.car.service;

import com.scotycode.car.VO.ResponseTemplateVO;
import com.scotycode.car.entity.Car;
import com.scotycode.car.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public ResponseTemplateVO getCarFromCarShowroom(Long carId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Car car = carRepository.findByCarId(carId);
    }
}
