package com.affinity.awas.security.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UTL_V_USER_PROCESSES" )
public class Privilege  implements Serializable{
	
	private static final long serialVersionUID = -8167821807927836188L;

	@Id
	@Column(name = "PROCESS_ID")
	private Long processId;

	@Column(name = "PROCESS_CODE")
	private String name;
	
	@Column(name="PERS_CODE")
	private Integer persCode;

	public Long getProcessId() {
		return processId;
	}

	public void setProcessId(Long id) {
		this.processId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPersCode() {
		return persCode;
	}

	public void setPersCode(Integer persCode) {
		this.persCode = persCode;
	}
 
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Privilege other = (Privilege) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Privilege [name=" + name + "]";
	}
}
