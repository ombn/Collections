package com.xworkz.datastore.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HighwayDAOimpl implements HighwayDAO {

	private List<HighwayDTO> list = new ArrayList<>();
	@Override
	public boolean save(HighwayDTO dto) {
		System.out.println("---added---\n"+dto);
		return list.add(dto);
	}

	@Override
	public Collection<HighwayDTO> findAll() {
		System.out.println("---found all---");
		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Iterator<HighwayDTO> itr = this.list.iterator();
		Collection <Integer> collection = new ArrayList<>();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			collection.add(highwayDTO.getNumber());
		}
		System.out.println("---Found all numbers---");
		return collection;
	}

	@Override
	public int totalItems() {
		System.out.println("---Total Items---");
		return list.size();
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getHighwaytype() == type) {
				collection.add(highwayDTO);
			}
		}
		System.out.println("---found by HighwayType"+type+"---");
		return collection;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sname) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getStateName().equals(sname)) {
				collection.add(highwayDTO);
			}
		}
		System.out.println("---found by state name"+sname+"---");
		return collection;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		System.out.println("---exist---");
		return this.list.contains(dto);
	}

	@Override
	public boolean isCondition(int number) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getNumber() == number) {
				System.out.println("---isCondition---");
				return highwayDTO.getCondition();
			}
		}
		System.out.println("No such number");
		return false;
	}

	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getNumber() == no) {
				System.out.println("---found length by number---");
				return highwayDTO.getLength();
			}
		}
		System.out.println("no such number");
		return 0;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		Iterator<HighwayDTO> itr = this.list.iterator();
		HighwayDTO dto = itr.next();
		while (itr.hasNext()) {
			double length = dto.getLength();
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getLength() > length) {
				dto = highwayDTO;
			}
		}
		System.out.println("---found by maximum length---");
		return dto;
	}

	@Override
	public HighwayDTO findByMinLength() {
		Iterator<HighwayDTO> itr = this.list.iterator();
		HighwayDTO dto = itr.next();
		while (itr.hasNext()) {
			double length = dto.getLength();
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getLength() < length) {
				dto = highwayDTO;
			}
		}
		System.out.println("---found by minimum length---");
		return dto;
	}
}