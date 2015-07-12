//pmd for eclipse luna-pmd for eclipse site-copy URL-help-install new soft-past URL
//add-PMD-OK-PMD for Eclipse 4-next
package org.hillel.it.dreamteam.model.entity;

//functions get... change for find
import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
	private int id;
	private Date createdAt;
	private Client createdBy;

	private static final long serialVersionUID = 1L;

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

	public Client getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Client createdBy) {
		this.createdBy = createdBy;
	}

}
