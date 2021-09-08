package com.ultramain.um21.aircraftair;

import com.ultramain.um21.aircraftdao.AirSqlDao;
import com.ultramain.um21.aircraftdao.AircraftIDao;

public class SqlAircraft extends AbstractAircraft {

	
	public AircraftIDao getDao() {
		
		return new AirSqlDao();
	}

}
