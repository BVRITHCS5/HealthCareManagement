package com.capg.hcs.service;

import java.util.List;

import com.capg.hcs.entity.DiagnosticCenter;

public interface IHealthCareService {
	public DiagnosticCenter addCenter(DiagnosticCenter center);
	public List<DiagnosticCenter> displaycenter();
	public void removeCenter(int center_id);
}
