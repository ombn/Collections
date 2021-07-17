package com.xworkz.datastore.dto;

import java.io.Serializable;

public class TempleDTO implements Serializable{

	private int id;
	private String name;
	private String location;
	private double entryFee;
	private String specialPrasada;
	private int noOfPoojaris;
	private boolean male;
	private String mainGod;
	private boolean kalyani;
	
	public TempleDTO() {
		super();
	}
	public TempleDTO(int id, String name, String location, double entryFee, String specialPrasada, int noOfPoojaris,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.entryFee = entryFee;
		this.specialPrasada = specialPrasada;
		this.noOfPoojaris = noOfPoojaris;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getEntryFee() {
		return entryFee;
	}
	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}
	public boolean isKalyani() {
		return kalyani;
	}
	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}
	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", entryFee=" + entryFee
				+ ", specialPrasada=" + specialPrasada + ", noOfPoojaris=" + noOfPoojaris + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof TempleDTO) {
			TempleDTO temple = (TempleDTO) obj;
			if(this.id == temple.getId() && this.name.equals(temple.getName()) && this.location.equals(temple.getLocation())) {
				return true;
			}
		}
		return false;
	}
}