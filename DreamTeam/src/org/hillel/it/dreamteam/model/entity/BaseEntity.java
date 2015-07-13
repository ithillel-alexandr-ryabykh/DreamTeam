package org.hillel.it.dreamteam.model.entity;
/**
 * @author Alexander Ruabykh
 */
import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
	/**
	 * @id for serial number 
	 * @createdAt to declare when it was created
	 * @createdBy to declare who created
	 */
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
