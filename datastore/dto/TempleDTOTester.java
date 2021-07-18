package com.xworkz.datastore.dto;

import java.util.Collection;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOimpl;

public class TempleDTOTester {

	public static void main(String[] args) {
		
		TempleDTO dto1 = new TempleDTO(1, "Golden Temple", "Vellore", 1500, "Laddu", 10, true, "Krishna", true);
		TempleDTO dto2 = new TempleDTO(2, "Shivan Temple", "Dharmapuri", 500, "Sweet", 8, true, "Shiva", false);
		TempleDTO dto3 = new TempleDTO(3, "Ganesha Temple", "Chennai", 1000, "jalebi", 11, true, "Ganesh", true);
		TempleDTO dto4 = new TempleDTO(4, "Hanuman Temple", "Salem", 700, "pongal", 5, true, "Hanuman", false);
		
		TempleDAO dao = new TempleDAOimpl();
		
		System.out.println("________________");
		dao.save(dto1);
		dao.save(dto2);	
		dao.save(dto3);
		dao.save(dto4);
		
		System.out.println("________________");
		System.out.println(dao.totalItems());
		
		System.out.println("________________");
		TempleDTO dtoDelete = new TempleDTO(4, "Hanuman Temple", "Salem", 700, "pongal", 8, true, "Hanuman", false);
		dao.delete(dtoDelete);
		
		System.out.println("________________");
		System.out.println(dao.findFirstItem());
		
		System.out.println("________________");
		System.out.println(dao.findLastItem());
		
		System.out.println("________________");
		System.out.println(dao.findByName("Golden Temple"));
		
		System.out.println("________________");
		System.out.println(dao.findByLocation("Chennai"));
		
		System.out.println("________________");
		System.out.println(dao.findByLocationAndName("Ganesha Temple", "Chennai"));
		
		System.out.println("________________");
		Collection<TempleDTO> collection1 = dao.findAll();
		for(TempleDTO temple : collection1) {
			System.out.println(temple);
		}
		System.out.println("________________");
		Collection<TempleDTO> collection2 = dao.findAllTempleByLocationStartsWith('C');
		for(TempleDTO temple : collection2) {
			System.out.println(temple);
		}
		System.out.println("________________");
		Collection<TempleDTO> collection3 = dao.findAllTempleByNoOfPoojarisGreaterThan(8);
		for(TempleDTO temple : collection3) {
			System.out.println(temple);
		}
		System.out.println("________________");
		Collection<TempleDTO> collection4 = dao.findAllTempleByEntryFeeGreaterThan(600);
		for(TempleDTO temple : collection4) {
			System.out.println(temple);
		}
		System.out.println(dao.findLocationByName("Shivan Temple"));
		
		System.out.println(dao.findAllLocations());
	}
}
