package com.affinity.qas.domain; 

		
 
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="QA_EVENT_STATUS_MAST")
 
public class QaEventStatusMast {
  


		@Id 

	@Column(name="STATUS_CODE")

		private Integer statusCode;

		public Integer getStatusCode() {
		return statusCode;
		}
	

		public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
		}
	

	@Column(name="STATUS_DESC")

		private String statusDesc;

		public String getStatusDesc() {
		return statusDesc;
		}
	

		public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
		}
	

	}
	
  
