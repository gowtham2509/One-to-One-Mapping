package com.mapping.repository;

import com.mapping.entity.MotorCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorCycleRepository extends JpaRepository<MotorCycle,Integer> {
}
