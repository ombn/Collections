package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOimpl implements TempleDAO {
	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("***Added***\n"+dto);
		return list.add(dto);
	}

	@Override
	public int totalItems() {
		System.out.println("***Total Items***");
		return list.size();
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("***Deleted***\n"+dto);
			return this.list.remove(dto);
		}
		System.out.println("There is no such temple");
		return false;
	}

	@Override
	public TempleDTO findFirstItem() {
		System.out.println("***Found first item***");
		return this.list.get(0);
	}

	@Override
	public TempleDTO findLastItem() {
		System.out.println("***Found last item***");
		return this.list.get(this.list.size()-1);
	}

	@Override
	public TempleDTO findByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				System.out.println("***Found by name = '"+name+"'***");
				return templeDTO;
			}
		}
		return null;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(loc)) {
				System.out.println("***Found by location = '"+loc+"'***");
				return templeDTO;
			}
		}
		return null;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name) && templeDTO.getLocation().equals(location)) {
				System.out.println("***Found by location = '"+location+"' and name = '"+name+"'***");
				return templeDTO;
			}
		}
		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char character) {
		char c = character;
		String s = Character.toString(c);
		Iterator <TempleDTO> itr = this.list.iterator();
		Collection <TempleDTO> collection = new ArrayList<>();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().startsWith(s)) {
				System.out.println("***All temple by location starts With '"+character+"'***");
				collection.add(templeDTO);
			}
		}
		return collection;
	}
	
	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				System.out.println("***Location found by '"+name+"'***");
				return templeDTO.getLocation();
			}
		}
		return null;
	}
	
	@Override
	public Collection<TempleDTO> findAll() {
		System.out.println("***Found all***");
		return this.list;
	}
	
	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Collection<TempleDTO> collection = new ArrayList <TempleDTO>();
		Iterator<TempleDTO> entryFeeGreaterThan = this.list.iterator();
		while( entryFeeGreaterThan.hasNext()) {
			TempleDTO templeDTO = entryFeeGreaterThan.next();
			if(templeDTO.getEntryFee() > cost) {
				collection.add(templeDTO);
			}
		}
		System.out.println("***All temple by Entry-fee greater than '"+cost+"'***");
		return collection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no) {
		Collection<TempleDTO> collection = new ArrayList <TempleDTO>();
		Iterator<TempleDTO> PoojarisGreaterThan = this.list.iterator();
		while( PoojarisGreaterThan.hasNext()) {
			TempleDTO templeDTO = PoojarisGreaterThan.next();
			if(templeDTO.getNoOfPoojaris() > no) {
			collection.add(templeDTO);
			}
		}
		System.out.println("***All temple by no. of poojaris greater than '"+no+"'***");
		return collection;
	}

	@Override
	public Collection<String> findAllLocations() {
		Iterator <TempleDTO> itr = this.list.iterator();
		Collection <String> collection = new ArrayList<>();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			collection.add(templeDTO.getLocation());
			}
		System.out.println("***Found all locations***");
		return collection;
	}
}