package com.capg.hcs.dao;

import java.util.List;

import com.capg.hcs.entity.DiagnosticCenter;

public interface IHealthCareDao {
	public DiagnosticCenter addCenter(DiagnosticCenter center);
	public void removeCenter(int center_id);
	 public List<DiagnosticCenter >displaycenter();

}
