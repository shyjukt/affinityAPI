/**
 * User.java
 * Modification log:
 * Date 		Author				Description
 * Sep 5, 2016	binu.kc	Created Account.java
 */
package com.affinity.awas.security.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "UTL_V_USER_ACCOUNTS")
public class User implements Serializable {

	private static final long serialVersionUID = 8174520821326499505L;

	@Id
	@Column(name = "PERS_CODE")
	private Integer persCode;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PWD_LAST_MODIFIED")
	private Date passwordLastModified;

	@Type(type = "yes_no")
	@Column(name = "ACTIVE_YN")
	private boolean active;

	@OneToMany( targetEntity=Privilege.class,  fetch=FetchType.EAGER,
			cascade = CascadeType.ALL)
	@JoinColumn(name = "PERS_CODE") 
	private List<Privilege> privs ;

	public Integer getPersCode() {
		return persCode;
	}

	public void setPersCode(Integer id) {
		this.persCode = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String loginId) {
		this.userName = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPasswordLastModified() {
		return passwordLastModified;
	}

	public void setPasswordLastModified(Date passwordLastModified) {
		this.passwordLastModified = passwordLastModified;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
 	public List<Privilege> getPrivilege() {
		return privs;
	}

	public void setPrivilege(List<Privilege> privs) {
		this.privs = privs;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Account [loginId=" + userName + ", active=" + active + "]";
	}
	
}