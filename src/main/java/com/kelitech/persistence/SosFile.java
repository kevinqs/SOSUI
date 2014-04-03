package com.kelitech.persistence;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="sos_file")
public class SosFile {

    private Long sosFileId;
	private String workPostNumber;
	private Employee author;
	private Employee auditor;
	private Employee approver;
	private Date effectiveDate;
	private Set<WorkOperationManual> workOperationManual;

    @Id
    @GeneratedValue
    @Column(name="sos_file_id")
	public Long getSosFileId() {
		return sosFileId;
	}

	public void setSosFileId(Long sosFileId) {
		this.sosFileId = sosFileId;
	}

	public String getWorkPostNumber() {
		return workPostNumber;
	}

	public void setWorkPostNumber(String workPostNumber) {
		this.workPostNumber = workPostNumber;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Employee getAuthor() {
		return author;
	}

	public void setAuthor(Employee author) {
		this.author = author;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Employee getAuditor() {
		return auditor;
	}

	public void setAuditor(Employee auditor) {
		this.auditor = auditor;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public Employee getApprover() {
		return approver;
	}

	public void setApprover(Employee approver) {
		this.approver = approver;
	}

	@Column
	@Type(type="date")
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sosFile")
	public Set<WorkOperationManual> getWorkOperationManual() {
		return workOperationManual;
	}

	public void setWorkOperationManual(Set<WorkOperationManual> workOperationManual) {
		this.workOperationManual = workOperationManual;
	}

}
