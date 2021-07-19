package com.xworkz.datastore.dao;

import java.util.Collection;

public class HighwayDTOTester {

	public static void main(String[] args) {
		
		HighwayDTO dto1 = new HighwayDTO(1, 14, HighwayType.NH, "karnataka", 1980, true, "Karnataka Road Development Corporation (KRDCL)");
		HighwayDTO dto2 = new HighwayDTO(2, 10, HighwayType.SH, "tamilnadu", 500, true, "Tamil Nadu Road Development Company Ltd");
		HighwayDTO dto3 = new HighwayDTO(3, 25, HighwayType.NH, "andhra pradesh", 6860, true, "Andhra Pradesh Road Development Corporation (APRDC)");
		HighwayDTO dto4 = new HighwayDTO(4, 8, HighwayType.SH, "kerala", 1332, true, "Road Infrastructure Company Kerala (RICK) Ltd");
		HighwayDAO dao = new HighwayDAOimpl();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		System.out.println(dao.totalItems());
		
		System.out.println(dao.findAllNumber());
		
		Collection<HighwayDTO> collection2 = dao.findByHighwayType(HighwayType.SH);
		for(HighwayDTO highway : collection2) {
			System.out.println(highway);
		}
		
		Collection<HighwayDTO> collection3 = dao.findAll();
		for(HighwayDTO highway : collection3) {
			System.out.println(highway);
		}
		
		System.out.println(dao.exist(dto4));
		
		System.out.println(dao.findLengthByNumber(20));
		
		Collection<HighwayDTO> collection4 = dao.findByStateName("tamilnadu");
		for(HighwayDTO highway : collection4) {
			System.out.println(highway);
		}
		
		System.out.println(dao.isCondition(8));
		
		System.out.println(dao.findByMaxLength());
		
		System.out.println(dao.findByMinLength());
	}
}