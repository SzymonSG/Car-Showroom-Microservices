package com.scotycode.car.controller;

import com.scotycode.car.VO.ResponseTemplateVO;
import com.scotycode.car.entity.Car;
import com.scotycode.car.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/cars")
@RestController
public class CarController {

    private final CarService carService;

    @PostMapping("/")
    Car saveCar(@RequestBody Car car){
        log.info("Inside save car of CarController");
        return carService.saveCar(car);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getCarFromCarShowroom(@PathVariable("id") Long carId){
        log.info("Inside getCarFromCarShowroom of CarController");
        return carService.getCarFromCarShowroom(carId);
    }
}
