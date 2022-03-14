package com.scotycode.carshowroomservice.repository;

import com.scotycode.carshowroomservice.entity.CarShowroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarShowroomRepository extends JpaRepository<CarShowroom,Long> {

}
