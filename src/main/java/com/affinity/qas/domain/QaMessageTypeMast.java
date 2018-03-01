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
@Table(name="QA_MESSAGE_TYPE_MAST")
 
public class QaMessageTypeMast {
  


		@Id 

	@Column(name="TYPE_CODE")

		private String typeCode;

		public String getTypeCode() {
		return typeCode;
		}
	

		public void setTypeCode(String typeCode) {
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
	

	@Column(name="MESSAGE_CATEGORY")

		private Integer messageCategory;

		public Integer getMessageCategory() {
		return messageCategory;
		}
	

		public void setMessageCategory(Integer messageCategory) {
		this.messageCategory = messageCategory;
		}
	

	}
	
  
