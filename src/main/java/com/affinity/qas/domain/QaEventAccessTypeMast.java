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
@Table(name="QA_EVENT_ACCESS_TYPE_MAST")
 
public class QaEventAccessTypeMast {
  


		@Id 

	@Column(name="TYPE_CODE")

		private Integer typeCode;

		public Integer getTypeCode() {
		return typeCode;
		}
	

		public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
		}
	

	@Column(name="TYPE_DESC")

		private String typeDesc;

		public String getTypeDesc() {
		return typeDesc;
		}
	

		public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
		}
	

	}
	
  
