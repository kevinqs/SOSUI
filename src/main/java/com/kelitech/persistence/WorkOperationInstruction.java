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
@Table(name="WorkOperation_Instruction")
public class WorkOperationInstruction {

	private long workOperationInstructionId;
	
	private String operationSummary;
	
	private String operationCategory;
	
	private Set<WorkOperationStep>  workOperationSteps;
	
	private WorkOperationManual workOperationManual;
	
    @Id
    @GeneratedValue
    @Column(name="workoperation_instruction_id")
	public long getWorkOperationInstructionId() {
		return workOperationInstructionId;
	}
	
	public void setWorkOperationInstructionId(long workOperationInstructionId) {
		this.workOperationInstructionId = workOperationInstructionId;
	}
	
	public String getOperationSummary() {
		return operationSummary;
	}
	
	public void setOperationSummary(String operationSummary) {
		this.operationSummary = operationSummary;
	}
	
	public String getOperationCategory() {
		return operationCategory;
	}
	
	public void setOperationCategory(String operationCategory) {
		this.operationCategory = operationCategory;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOperationInstruction")
	public Set<WorkOperationStep> getWorkOperationSteps() {
		return workOperationSteps;
	}
	
	public void setWorkOperationSteps(Set<WorkOperationStep> workOperationSteps) {
		this.workOperationSteps = workOperationSteps;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "workoperation_manual_id", nullable = false)	
	public WorkOperationManual getWorkOperationManual() {
		return workOperationManual;
	}

	public void setWorkOperationManual(WorkOperationManual workOperationmanual) {
		this.workOperationManual = workOperationmanual;
	}

}
