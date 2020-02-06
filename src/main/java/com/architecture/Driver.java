package com.architecture;

import com.architecture.dao.BuidlingDao;
import com.architecture.model.Building;

public class Driver {

	public static void main(String[] args) {
		new BuidlingDao().save(new Building(0,"hey ya",0));
	}
}
