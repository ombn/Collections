package com.xworkz.datastore.dto;

import java.io.Serializable;

public class RiverDTO implements Serializable {

	private String name;
	private String origin;
	private double length;
	private int noOfStatesInFlow;
	private boolean hydroPlant;

	public RiverDTO() {
		super();
	}

	public RiverDTO(String name, String origin, double length, int noOfStatesInFlow, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStatesInFlow = noOfStatesInFlow;
		this.hydroPlant = hydroPlant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RiverDTO) {
			RiverDTO river = (RiverDTO) obj;
			if (this.name.equals(river.getName()))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesInFlow="
				+ noOfStatesInFlow + ", hydroPlant=" + hydroPlant + "]";
	}
}
