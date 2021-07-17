package com.xworkz.datastore.dto;

import com.xworkz.datastore.dao.RiverDAO;
import com.xworkz.datastore.dao.RiverDAOimpl;

public class RiverDTOTester {

	public static void main(String[] args) {
		
		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);

		RiverDTO dto1 = new RiverDTO("Sharavati", "Ambutirtha", 128, 1, true);
		
		RiverDAO dao = new RiverDAOimpl();
		dao.save(dto);
		dao.save(dto1);
		
		System.out.println(dao.totalItems());
		
		RiverDTO dtoUpdate = new RiverDTO("Kaveri","Talakaveri",800, 4, true);
		dao.update(dtoUpdate);
		
		System.out.println("total items: "+dao.totalItems());
		
		RiverDTO dtoDelete = new RiverDTO("Sharavati", "Ambutirtha", 128, 1, true);
		
		dao.delete(dtoDelete);
		
		System.out.println("total Items: "+dao.totalItems());
	}
}