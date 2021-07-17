package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOimpl implements TempleDAO {
	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("dto: " + dto);
		System.out.println("dto was added");
		return list.add(dto);
	}

	@Override
	public int totalItems() {
		return list.size();
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed: " + dto);
			return this.list.remove(dto);
		}
		System.out.println("There is no such temple");
		return false;
	}

	@Override
	public TempleDTO findFirstItem() {
		Iterator <TempleDTO> itr = this.list.iterator();
		return itr.next();
	}

	@Override
	public TempleDTO findLastItem() {
		Iterator<TempleDTO> itr = this.list.iterator();
		TempleDTO lastItem = null;
		while (itr.hasNext()) {
			lastItem = itr.next();
		}
		return lastItem;
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				dto = templeDTO;
				return dto;
			}
		}
		return null;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(loc)) {
				dto = templeDTO;
				return dto;
			}
		}
		return null;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name) && templeDTO.getLocation().equals(location)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char character) {
		Iterator <TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			char c = templeDTO.getLocation().charAt(0);
			if (c == character) {
				System.out.println("Temple By Location starts With "+character+"\n"+templeDTO);
			}
		}
		return null;
	}
	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				System.out.println("location found by "+name);
				return templeDTO.getLocation();
			}
		}
		return null;
	}
	@Override
	public Collection<TempleDTO> findAll() {
		
		return null;
	}
	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {

		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no) {
		
		return null;
	}
}