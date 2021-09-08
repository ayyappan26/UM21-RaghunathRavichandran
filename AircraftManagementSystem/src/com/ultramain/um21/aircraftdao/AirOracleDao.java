package com.ultramain.um21.aircraftdao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import com.aircraftDto.AircraftDto;

import project.data.DataConnect;

public class AirOracleDao implements AircraftIDao {

	
	public void registerAircraft(AircraftDto adto) throws SQLException {
		Connection con=DataConnect.getDbConnection();
		String query="INSERT INTO aircraft VALUES (?,?)";
		PreparedStatement pst=con.prepareCall(query);
		pst.setString(1,adto.getAircraftCode());
		pst.setString(2, adto.getDescription());
		int rowupdate=pst.executeUpdate();
		System.out.println("Upadated rows :"+rowupdate);
		
		
	}

	
	public void createSector(AircraftDto adto) throws SQLException  {
		//ArrayList<String> craftCode=new ArrayList<>();
		Connection con=DataConnect.getDbConnection();
		String query="INSERT INTO sector VALUES(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, adto.getSectorId());
		pst.setString(2,adto.getAircraftCode());
		pst.setString(3, adto.getFromStation());
		pst.setDate(4,adto.getScheduleDate());
		pst.setInt(5, adto.getScheduleTime());
		pst.setString(6, adto.getToStation());
		int ru=pst.executeUpdate();
		System.out.println("updated row :"+ru);		
	}

	
	public HashMap<String, ArrayList<AircraftDto>> viewSectorDetailsByAircraft() throws SQLException {
		
		ArrayList<String> code=new ArrayList<String>();
		HashMap<String,ArrayList<AircraftDto>> aircraftmap=new HashMap<>();
		Connection con=DataConnect.getDbConnection();
		String sql="SELECT DISTINCT aircraft_code FROM aircraft";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			code.add(rs.getString(1));
		}
		for(String str:code){
			ArrayList<AircraftDto> newList=getSectorDetails(str);
			aircraftmap.put(str,newList);
			
		}
		return aircraftmap;
		
	}
	private ArrayList<AircraftDto> getSectorDetails(String aircode) throws SQLException{
		//AircraftDto dto=new AircraftDto();
		ArrayList<AircraftDto> airlist=new ArrayList<>();
		Connection con=DataConnect.getDbConnection();
		String query="SELECT sector_id,aircract_code,from_station,schedule_date,schedule_time,to_station FROM sector WHERE aircract_code=?";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, aircode);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			AircraftDto adto=new AircraftDto();
			adto.setSectorId(rs.getString(1));
			adto.setAircraftCode(rs.getString(2));
			adto.setFromStation(rs.getString(3));
			adto.setScheduleDate(rs.getDate(4));
			adto.setScheduleTime(rs.getInt(5));
			adto.setToStation(rs.getString(6));
			airlist.add(adto);
		}
		return airlist;	
	}

	
	

}
