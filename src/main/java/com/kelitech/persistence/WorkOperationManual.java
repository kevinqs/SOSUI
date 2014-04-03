package com.kelitech.persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="WorkOperation_Manual")
public class WorkOperationManual {
	private long workOperationManualId;
	private String carModel;
	private String workPostNumber;
	private String workSectionNumber;
	private String workStationNumber;
	private Set<WorkOperationInstruction> workOperationInstructions;
	private SosFile sosFile;
	
    @Id
    @GeneratedValue
    @Column(name="workoperation_manual_id")
	public long getWorkOperationManualId() {
		return workOperationManualId;
	}
	
	public void setWorkOperationManualId(long workOperationManualId) {
		this.workOperationManualId = workOperationManualId;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public String getWorkPostNumber() {
		return workPostNumber;
	}
	
	public void setWorkPostNumber(String workPostNumber) {
		this.workPostNumber = workPostNumber;
	}
	
	public String getWorkSectionNumber() {
		return workSectionNumber;
	}
	
	public void setWorkSectionNumber(String workSectionNumber) {
		this.workSectionNumber = workSectionNumber;
	}
	
	public String getWorkStationNumber() {
		return workStationNumber;
	}
	
	public void setWorkStationNumber(String workStationNumber) {
		this.workStationNumber = workStationNumber;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOperationManual")
	public Set<WorkOperationInstruction> getWorkOperationInstructions() {
		return workOperationInstructions;
	}
	
	public void setWorkOperationInstructions(Set<WorkOperationInstruction> workOperationInstructions) {
		this.workOperationInstructions = workOperationInstructions;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sos_file_id", nullable = false)	
	public SosFile getSosFile() {
		return sosFile;
	}

	public void setSosFile(SosFile sosFile) {
		this.sosFile = sosFile;
	}
	

}
