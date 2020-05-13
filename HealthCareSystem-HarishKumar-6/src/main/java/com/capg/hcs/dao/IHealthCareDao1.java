package com.capg.hcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareDao1 extends JpaRepository<Appointment,Integer>{
	@Modifying
	@Query(value="update appointment_list SET APPROVED=?2 where APPOINTMENT_ID=?1",nativeQuery = true)
	int update(int appointmentId, String approved);
}
