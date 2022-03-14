package com.scotycode.carshowroomservice.service;

import com.scotycode.carshowroomservice.entity.CarShowroom;
import com.scotycode.carshowroomservice.repository.CarShowroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;


@RequiredArgsConstructor
@Service
public class CarShowroomServiceImpl implements CarShowroomService {

    private final CarShowroomRepository carShowroomRepository;

    @Override
    public CarShowroom saveCarShowroom(CarShowroom carShowroom) {
        return carShowroomRepository.save(carShowroom);
    }

    @Override
    public CarShowroom findCarShowroomById(Long carShowroom) {
        return carShowroomRepository.findById(carShowroom)
                .orElseThrow(()->new RuntimeException("Not found carShowroom with this Id"));
    }


}
