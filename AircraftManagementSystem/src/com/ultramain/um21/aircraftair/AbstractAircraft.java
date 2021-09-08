package com.ultramain.um21.aircraftair;

import com.ultramain.um21.aircraftdao.AircraftIDao;

public abstract class AbstractAircraft {
	public abstract AircraftIDao getDao();
	public static AbstractAircraft getAircraft(int c){
		AbstractAircraft craft=null;
		switch(c){
		case 1:
			craft=new OracleAircraft();
			break;
		case 2:
			craft=new SqlAircraft();
			break;
		case 3:
			craft=new FileSystemAircraft();
			break;
		}
		return craft;
		
	}
	

}
