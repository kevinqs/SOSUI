package com.kelitech.persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WorkPost_Part")
public class WorkPostPart {

	private long workPostPartId;
	private Part part;
	private int amount;
	private int stockAlert;
	private String stationTool;
	private WorkOperationStep workOperationStep;

    @Id
    @GeneratedValue
    @Column(name="workpostpart_id")
	public long getWorkPostPartId() {
		return workPostPartId;
	}
	public void setWorkPostPartId(long workPostPartId) {
		this.workPostPartId = workPostPartId;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStockAlert() {
		return stockAlert;
	}
	public void setStockAlert(int stockAlert) {
		this.stockAlert = stockAlert;
	}
	public String getStationTool() {
		return stationTool;
	}
	public void setStationTool(String stationTool) {
		this.stationTool = stationTool;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "workoperationstep_id", nullable = false)	
	public WorkOperationStep getWorkOperationStep() {
		return workOperationStep;
	}
	
	public void setWorkOperationStep(WorkOperationStep workOperationStep) {
		this.workOperationStep = workOperationStep;
	}
	
}
