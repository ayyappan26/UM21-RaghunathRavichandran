package com.ultramain.um21.aircraftdao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.aircraftDto.AircraftDto;

public interface AircraftIDao {
	public void registerAircraft(AircraftDto adto) throws SQLException;
	public void createSector(AircraftDto adto) throws SQLException;
	public HashMap<String,ArrayList<AircraftDto>> viewSectorDetailsByAircraft() throws SQLException;

}
