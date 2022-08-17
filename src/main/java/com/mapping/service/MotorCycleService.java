package com.mapping.service;

import com.mapping.entity.MotorCycle;

import java.util.List;
import java.util.Optional;

public interface MotorCycleService {
    void createMotor(MotorCycle motorCycle);
    List<MotorCycle> getAllMotor();
    Optional<MotorCycle> findMotor(int id);
    void updateMotor(MotorCycle motorCycle,int id);
    void deleteMotor(int id);
}
