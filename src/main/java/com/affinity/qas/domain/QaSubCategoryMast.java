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
@Table(name="QA_SUB_CATEGORY_MAST")
 
public class QaSubCategoryMast {
  


		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_CATEGORY_CODE", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="SUB_CAT_CODE")

		private Integer subCatCode;

		public Integer getSubCatCode() {
		return subCatCode;
		}
	

		public void setSubCatCode(Integer subCatCode) {
		this.subCatCode = subCatCode;
		}
	

	@Column(name="SUB_CAT_DESC")

		private String subCatDesc;

		public String getSubCatDesc() {
		return subCatDesc;
		}
	

		public void setSubCatDesc(String subCatDesc) {
		this.subCatDesc = subCatDesc;
		}
	

	@Column(name="STATUS")

		private Integer status;

		public Integer getStatus() {
		return status;
		}
	

		public void setStatus(Integer status) {
		this.status = status;
		}
	

	@Column(name="CATEGORY_CODE")

		private Integer categoryCode;

		public Integer getCategoryCode() {
		return categoryCode;
		}
	

		public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
		}
	

	}
	
  
