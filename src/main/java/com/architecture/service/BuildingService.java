package com.architecture.service;

import com.architecture.dao.BuidlingDao;
import com.architecture.model.Building;

public class BuildingService {

	public static Building getById(int id) {
		return new BuidlingDao().findById(id);
	}
}
