package com.mapping.controller;

import com.mapping.entity.MotorCycle;
import com.mapping.service.MotorCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MotorCycleController {

    @Autowired
    private MotorCycleService motorCycleService;

    @PostMapping("/motorcycle")
    public ResponseEntity<MotorCycle> createMotor(@RequestBody MotorCycle motorCycle){
        motorCycleService.createMotor(motorCycle);
        return new ResponseEntity("Data Saved", HttpStatus.CREATED);
    }

    @GetMapping("/motorcycle")
    public List<MotorCycle> getAllMotor(){
        return motorCycleService.getAllMotor();
    }

    @GetMapping("/motorcycle/{id}")
    public Optional<MotorCycle> findMotor(@PathVariable int id){
        return motorCycleService.findMotor(id);
    }

    @PutMapping("/motorcycle")
    public ResponseEntity<MotorCycle> updateMotor(@RequestBody MotorCycle motorCycle,
                                                  @PathVariable int id){
        motorCycleService.updateMotor(motorCycle,id);
        return new ResponseEntity("Motor Updated",HttpStatus.OK);
    }

    @DeleteMapping("/motorcycle/{id}")
    public ResponseEntity<MotorCycle> deleteMotor(@PathVariable int id){
        motorCycleService.deleteMotor(id);
        return new ResponseEntity("Motor Deleted",HttpStatus.OK);
    }
}
