package com.affinity.awas.security.entity; 

		
 
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UTL_V_USER_PROCESSES")
 
public class UtlUserProcesses {
  




		@Id 

	@Column(name="PROCESS_ID")

		private Integer processId;

		public Integer getProcessId() {
		return processId;
		}
	

		public void setProcessId(Integer processId) {
		this.processId = processId;
		}
	

	@Column(name="PROCESS_CODE")

		private String processCode;

		public String getProcessCode() {
		return processCode;
		}
	

		public void setProcessCode(String processCode) {
		this.processCode = processCode;
		}
	

	@Column(name="LOGIN_ID")

		private String loginId;

		public String getLoginId() {
		return loginId;
		}
	

		public void setLoginId(String loginId) {
		this.loginId = loginId;
		}
	

	@Column(name="PERS_CODE")

		private Integer persCode;

		public Integer getPersCode() {
		return persCode;
		}
	

		public void setPersCode(Integer persCode) {
		this.persCode = persCode;
		}
	

	}
	
  
