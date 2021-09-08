package com.ultramain.um21.aircraftair;

import com.ultramain.um21.aircraftdao.AirFileSystemDao;
import com.ultramain.um21.aircraftdao.AircraftIDao;

public class FileSystemAircraft extends AbstractAircraft{

	
	public AircraftIDao getDao() {
		
		return new AirFileSystemDao();
	}

}
