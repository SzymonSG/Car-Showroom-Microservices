package com.scotycode.car.service;

import com.scotycode.car.VO.CarShowroom;
import com.scotycode.car.VO.ResponseTemplateVO;
import com.scotycode.car.entity.Car;
import com.scotycode.car.repository.CarRepository;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    private final RestTemplate restTemplate;

    @Override
    public Car saveCar(Car car) {
        log.info("Inside saveCar of CarService");
        return carRepository.save(car);
    }

    @Override
    public ResponseTemplateVO getCarFromCarShowroom(Long carId) {
        log.info("Inside getCartFromCarShowroom of CarService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Car car = carRepository.findByCarId(carId);

        CarShowroom carShowroom=
                restTemplate.getForObject("http://localhost:8081/carshowrooms/"+
                                car.getCarShowroomId()
                        ,CarShowroom.class);

        vo.setCar(car);
        vo.setCarShowroom(carShowroom);
        return vo;
    }
}
