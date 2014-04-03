package com.kelitech.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PART")
public class Part {

	private long partId;
	private String partNumer;
	private String partDescription;
	private String color;
	private String carModel;
	
    @Id
    @GeneratedValue
    @Column(name="part_id")
    public long getPartId() {
		return partId;
	}
    
	public void setPartId(long part_id) {
		this.partId = part_id;
	}
	public String getPartNumber() {
		return partNumer;
	}
    @Column(name="part_number")
	public void setPartNumber(String part_num) {
		this.partNumer = part_num;
	}
	public String getPartDescription() {
		return partDescription;
	}

    @Column(name="part_description")
	public void setPartDescription(String part_description) {
		this.partDescription = part_description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
}
