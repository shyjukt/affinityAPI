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
@Table(name="QA_PERSONAL_MAST")
 
public class QaPersonalMast {
  


		@Id 

	@Column(name="PERS_CODE")

		private Integer persCode;

		public Integer getPersCode() {
		return persCode;
		}
	

		public void setPersCode(Integer persCode) {
		this.persCode = persCode;
		}
	

	@Column(name="STAFF_NO")

		private String staffNo;

		public String getStaffNo() {
		return staffNo;
		}
	

		public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
		}
	

	@Column(name="PRINT_NAME")

		private String printName;

		public String getPrintName() {
		return printName;
		}
	

		public void setPrintName(String printName) {
		this.printName = printName;
		}
	

	}
	
  
