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
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="WorkPost_Tool")
public class WorkPostTool {

	private long workPostToolId;
	private Tool tool;
	private int amount;
	private WorkOperationStep workOperationStep;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="workposttool_id")
	public long getWorkPostToolId() {
		return workPostToolId;
	}
	public void setWorkPostToolId(long workPostToolId) {
		this.workPostToolId = workPostToolId;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Tool getTool() {
		return tool;
	}
	public void setTool(Tool tool) {
		this.tool = tool;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
