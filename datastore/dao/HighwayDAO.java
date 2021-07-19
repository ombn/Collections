package com.xworkz.datastore.dao;

import java.util.Collection;

public interface HighwayDAO {
	
	boolean save(HighwayDTO dto);
	Collection<HighwayDTO>findAll();
	Collection<Integer> findAllNumber();
	int totalItems();
	Collection<HighwayDTO> findByHighwayType(HighwayType type);
	Collection<HighwayDTO> findByStateName(String sname);
	boolean exist(HighwayDTO dto);
	boolean isCondition(int number);
	double findLengthByNumber(int no);
	HighwayDTO findByMaxLength();
	HighwayDTO findByMinLength();
}