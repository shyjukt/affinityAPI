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
@Table(name="QA_EVENT_DEPARTMENT_MAST")
 
public class QaEventDepartmentMast {
  


		@Id 

	@Column(name="DEPT_CODE")

		private Integer deptCode;

		public Integer getDeptCode() {
		return deptCode;
		}
	

		public void setDeptCode(Integer deptCode) {
		this.deptCode = deptCode;
		}
	

	@Column(name="DEPT_NAME")

		private String deptName;

		public String getDeptName() {
		return deptName;
		}
	

		public void setDeptName(String deptName) {
		this.deptName = deptName;
		}
	

	@Column(name="ACTIVE_YN")

		private String activeYn;

		public String getActiveYn() {
		return activeYn;
		}
	

		public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
		}
	

	}
	
  
