package com.control.hospital.repository;

import com.control.hospital.entity.SurgeryCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryCenterRepository extends JpaRepository<SurgeryCenter, String> {
}
