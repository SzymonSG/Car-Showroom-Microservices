package com.scotycode.carshowroomservice.service;

import com.scotycode.carshowroomservice.entity.CarShowroom;

public interface CarShowroomService {
    CarShowroom saveCarShowroom(CarShowroom carShowroom);

    CarShowroom findCarShowroomById(Long carShowroom);
}
