package com.mapping.service.impl;

import com.mapping.entity.MotorCycle;
import com.mapping.repository.MotorCycleRepository;
import com.mapping.service.MotorCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotorCycleServiceImpl implements MotorCycleService {

    @Autowired
    private MotorCycleRepository motorCycleRepository;

    @Override
    public void createMotor(MotorCycle motorCycle) {
        motorCycleRepository.save(motorCycle);
    }

    @Override
    public List<MotorCycle> getAllMotor() {
        return motorCycleRepository.findAll();
    }

    @Override
    public Optional<MotorCycle> findMotor(int id) {
        return motorCycleRepository.findById(id);
    }

    @Override
    public void updateMotor(MotorCycle motorCycle,int id) {
        motorCycleRepository.saveAndFlush(motorCycle);
    }

    @Override
    public void deleteMotor(int id) {
        motorCycleRepository.deleteById(id);
    }
}
