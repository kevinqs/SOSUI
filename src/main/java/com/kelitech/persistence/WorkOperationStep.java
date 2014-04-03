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
@Table(name="WorkOperation_Step")
public class WorkOperationStep {
	private long workOperationStepId;
	private Set<WorkPostPart>  parts;
	private Set<WorkPostTool> tools;
//	private List<WorkPostPart> accessaries;
	private String trainingVideoPath;
	private WorkOperationInstruction workOperationInstruction;

    @Id
    @GeneratedValue
    @Column(name="workoperationstep_id")
	public long getWorkOperationStepId() {
		return workOperationStepId;
	}
	
	public void setWorkOperationStepId(long workOperationStepId) {
		this.workOperationStepId = workOperationStepId;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOperationStep")
	public Set<WorkPostPart> getParts() {
		return parts;
	}
	
	public void setParts(Set<WorkPostPart> parts) {
		this.parts = parts; 
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOperationStep")
	public Set<WorkPostTool> getTools() {
		return tools;
	}
	
	public void setTools(Set<WorkPostTool> tools) {
		this.tools = tools;
	}
	
//	public List<WorkPostPart> getAccessaries() {
//		return accessaries;
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOperationStep")
//	public void setAccessaries(List<WorkPostPart> accessaries) {
//		this.accessaries = accessaries;
//	}
	
	public String getTrainingVideoPath() {
		return trainingVideoPath;
	}
	public void setTrainingVideoPath(String trainingVideoPath) {
		this.trainingVideoPath = trainingVideoPath;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "workoperation_instruction_id", nullable = false)	
	public WorkOperationInstruction getWorkOperationInstruction() {
		return workOperationInstruction;
	}

	public void setWorkOperationInstruction(WorkOperationInstruction workOperationInstruction) {
		this.workOperationInstruction = workOperationInstruction;
	}
	
}
