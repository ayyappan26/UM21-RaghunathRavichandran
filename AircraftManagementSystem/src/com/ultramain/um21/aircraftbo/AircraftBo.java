rrlp0pppackage com.ultramain.um21.aircraftbo;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.aircraft.abstractair.AbstractAircraft;
import com.aircraft.dao.AircraftIDao;
import com.aircraft.utility.Scan;
import com.aircraftDto.AircraftDto;

import project.data.DataConnect;

public class AircraftBo {
	
	public void selection(){
		System.out.println("1. Register Aircraft");
		System.out.println("2. Create Sector ");
		System.out.println("3. View Sector by aircraft code");
		System.out.println("4. Exit");
		Scanner sc=Scan.getScannerInstance();
		int c=sc.nextInt();
		switch(c){
		case 1:
			registerAircraft();
			break;
		case 2:
			createSector();
			break;
		case 3:
			viewSectorByAircraftCode();
			break;
		case 4:
			return;
		}
	}
	public void registerAircraft(){
		AbstractAircraft acraft=AbstractAircraft.getAircraft(1);
		AircraftIDao adao=acraft.getDao();
		AircraftDto adto=getAircraftDetails();
		
		try{
			adao.registerAircraft(adto);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		
	}
	public void createSector(){
		AbstractAircraft acraft=AbstractAircraft.getAircraft(1);
		AircraftIDao adao=acraft.getDao();
		try {
			getAircraftCode();
			AircraftDto adto=getSectorDetails();
			adao.createSector(adto);
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		
		
	}
	public void viewSectorByAircraftCode(){
		
		ArrayList<AircraftDto> airList=null;
		HashMap<String,ArrayList<AircraftDto>> airmap=null;
		AbstractAircraft acraft=AbstractAircraft.getAircraft(1);
		AircraftIDao adao=acraft.getDao();
		try{
			airmap=adao.viewSectorDetailsByAircraft();
			System.out.println("Enter the Aircraft Code");
			Scanner sc=Scan.getScannerInstance();
			String str=sc.next();
			airList=airmap.get(str);
			if(!airList.isEmpty()){
				for(AircraftDto adto:airList){
					System.out.println("Sector Id :"+adto.getSectorId());
					System.out.println("Aircraft code:"+adto.getAircraftCode());
					System.out.println("From station :"+adto.getFromStation());
					System.out.println("To Station  :"+adto.getFromStation());
					System.out.println("Schedule Date :"+adto.getScheduleDate());
					System.out.println("Schedule Time :"+adto.getScheduleTime());
					System.out.println("----------------------------------");
				}
			}
			
			
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		
		
	}
	private AircraftDto getAircraftDetails(){
		Scanner sc=Scan.getScannerInstance();
		AircraftDto airdto=new AircraftDto();
		System.out.println("Enter Aircraft Code :");
		airdto.setAircraftCode(sc.next());
		System.out.println("Enter the Description :");
		airdto.setDescription(sc.next());
		return airdto;
		
		
	}
	private void getAircraftCode() throws SQLException{
		ArrayList<String> code=new ArrayList<String>();
		Connection con=DataConnect.getDbConnection();
		String sql="SELECT DISTINCT aircraft_code FROM aircraft";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			code.add(rs.getString(1));
		}
		System.out.println("Aircraft codes ");
		for(String str:code){
			System.out.println(str);
		}
	}
	private AircraftDto getSectorDetails(){
		AircraftDto dto=new AircraftDto();
		Scanner sc=Scan.getScannerInstance();
		System.out.println("Enter the Sector Id :");
		dto.setSectorId(sc.next());
		System.out.println("Enter the aircraft code :");
		dto.setAircraftCode(sc.next());
		System.out.println("Enter From station :");
		dto.setFromStation(sc.next());
		//System.out.println("Enter the date :");
		//dto.setScheduleDate(Date.valueOf("26-AUG-21"));
		System.out.println("Enter the time :");
		dto.setScheduleTime(sc.nextInt());
		System.out.println("Enter to Station :");
		dto.setToStation(sc.next());
		return dto;
	}

}
