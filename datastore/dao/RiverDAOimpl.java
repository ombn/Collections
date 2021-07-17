package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.xworkz.datastore.dto.RiverDTO;

public class RiverDAOimpl implements RiverDAO {
	private List<RiverDTO> list = new ArrayList<RiverDTO>();
	@Override
	public boolean save(RiverDTO dto) {
		System.out.println("dto: "+dto);
		System.out.println("dto was added");
		return list.add(dto);
	}
	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}
	@Override
	public void update(RiverDTO dto) {
		boolean exist = this.list.contains(dto);
		if(exist) {
			System.out.println("dto found, will update "+dto);
			int indexOfRiver = this.list.indexOf(dto);
			this.list.set(indexOfRiver, dto);
		}
		else
			System.out.println("river does not exist");
	}
	@Override
	public boolean delete(RiverDTO dto) {
		if(this.list.contains(dto)) {
			System.out.println("removed "+dto);
			return this.list.remove(dto);
		}
		System.out.println("river not exist, cannot remove");
		return false;
	}
	@Override
	public RiverDTO findByName(String name) {
		RiverDTO dto = null;
		Iterator<RiverDTO> itr = this.list.iterator();
		while(itr.hasNext()) {
			RiverDTO riverDTO = itr.next();
			if(riverDTO.getName().equals(name)) {
				dto = riverDTO;
				break;
			}
		}
		return dto;
	}
}