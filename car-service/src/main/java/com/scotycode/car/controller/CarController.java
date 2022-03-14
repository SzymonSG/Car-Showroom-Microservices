package com.scotycode.car.controller;

import com.scotycode.car.entity.Car;
import com.scotycode.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/cars")
@RestController
public class CarController {

    private final CarService carService;

    @PostMapping("/")
    Car saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }
}
