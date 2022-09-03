package com.control.hospital.repository;

import com.control.hospital.entity.AttendanceSurgeryCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceSurgeryCenterRepository extends JpaRepository<AttendanceSurgeryCenter, String> {
}
