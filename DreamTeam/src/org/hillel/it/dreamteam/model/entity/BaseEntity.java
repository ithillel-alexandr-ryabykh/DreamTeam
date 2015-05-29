//pmd for eclipse luna-pmd for eclipse site-copy URL-help-install new soft-past URL
//add-PMD-OK-PMD for Eclipse 4-next
package org.hillel.it.dreamteam.model.entity;
//functions get... change for find

import java.util.Date;

public class BaseEntity {
	private int id;
	private Date createdAt;
	private Date changedAt;
	private Client createdBy;
	private Client changedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(Date changedAt) {
		this.changedAt = changedAt;
	}

	public Client getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Client createdBy) {
		this.createdBy = createdBy;
	}

	public Client getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(Client changedBy) {
		this.changedBy = changedBy;
	}

}
