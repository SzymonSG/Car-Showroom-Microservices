package com.scotycode.carshowroomservice.controller;

import com.scotycode.carshowroomservice.entity.CarShowroom;

import com.scotycode.carshowroomservice.service.CarShowroomService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/carshowrooms")
@Slf4j
public class CarShowroomController {

   private final CarShowroomService carShowroomService;


   @PostMapping("/")
   public CarShowroom saveCarShowroom(@RequestBody CarShowroom carShowroom){
       log.info("Inside save carShowRoom");
       return carShowroomService.saveCarShowroom(carShowroom);
   }

   @GetMapping("/{id}")
   public CarShowroom findCarShowroomById(@PathVariable("id") Long carShowroom){
       log.info("Inside findCarShowroom method of CarshowroomController");

       return carShowroomService.findCarShowroomById(carShowroom);
   }


}
