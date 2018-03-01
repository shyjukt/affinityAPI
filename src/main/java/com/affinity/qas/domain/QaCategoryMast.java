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
@Table(name="QA_CATEGORY_MAST")
 
public class QaCategoryMast {
  


		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_CATEGORY_CODE", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="CATEGORY_CODE")

		private Integer categoryCode;

		public Integer getCategoryCode() {
		return categoryCode;
		}
	

		public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
		}
	

	@Column(name="CATEGORY_DESC")

		private String categoryDesc;

		public String getCategoryDesc() {
		return categoryDesc;
		}
	

		public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
		}
	

	@Column(name="PREV_ID")

		private Integer prevId;

		public Integer getPrevId() {
		return prevId;
		}
	

		public void setPrevId(Integer prevId) {
		this.prevId = prevId;
		}
	

	@Column(name="LEAF_YN")

		private String leafYn;

		public String getLeafYn() {
		return leafYn;
		}
	

		public void setLeafYn(String leafYn) {
		this.leafYn = leafYn;
		}
	

	}
	
  
