package com.xworkz.datastore.dto;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOimpl;

public class TempleDTOTester {

	public static void main(String[] args) {
		
		TempleDTO dto1 = new TempleDTO(1, "Golden Temple", "Vellore", 1500, "Laddu", 10, true, "Krishna", true);
		TempleDTO dto2 = new TempleDTO(2, "Shivan Temple", "Dharmapuri", 500, "Sweet", 8, true, "Shiva", false);
		TempleDTO dto3 = new TempleDTO(3, "Ganesha Temple", "Chennai", 1000, "jalebi", 11, true, "Ganesh", true);
		TempleDTO dto4 = new TempleDTO(4, "Hanuman Temple", "Salem", 700, "pongal", 8, true, "Hanuman", false);
		
		TempleDAO dao = new TempleDAOimpl();
		dao.save(dto1);
		dao.save(dto2);	
		dao.save(dto3);
		dao.save(dto4);
		
		System.out.println("Total items: "+dao.totalItems());
		
		TempleDTO dtoDelete = new TempleDTO(4, "Hanuman Temple", "Salem", 700, "pongal", 8, true, "Hanuman", false);
		dao.delete(dtoDelete);
		
		System.out.println("First Item: \n"+dao.findFirstItem());
		System.out.println("Last Item: \n"+dao.findLastItem());
		System.out.println("found by name: \n"+dao.findByName("Golden Temple"));
		System.out.println("found by location: \n"+dao.findByLocation("Chennai"));
		System.out.println("found by location and name: \n"+dao.findByLocationAndName("Ganesha Temple", "Chennai"));
		System.out.println(dao.findAllTempleByLocationStartsWith('C'));
		System.out.println(dao.findLocationByName("Shivan Temple"));
	}
}
