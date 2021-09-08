package com.ultramain.um21.aircraftair;

import com.ultramain.um21.aircraftdao.AirOracleDao;
import com.ultramain.um21.aircraftdao.AircraftIDao;

public class OracleAircraft extends AbstractAircraft{

	
	public AircraftIDao getDao() {
	
		return new AirOracleDao();
	}

}
