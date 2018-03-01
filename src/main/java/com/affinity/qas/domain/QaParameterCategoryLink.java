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
@Table(name="QA_PARAMETER_CATEGORY_LINK")
 
public class QaParameterCategoryLink {
  


		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_PARA_CAT_LINK_ID", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="LINK_ID")

		private Integer linkId;

		public Integer getLinkId() {
		return linkId;
		}
	

		public void setLinkId(Integer linkId) {
		this.linkId = linkId;
		}
	

	@Column(name="PARAMETER_ID")

		private Integer parameterId;

		public Integer getParameterId() {
		return parameterId;
		}
	

		public void setParameterId(Integer parameterId) {
		this.parameterId = parameterId;
		}
	

	@Column(name="CATEGORY_ID")

		private Integer categoryId;

		public Integer getCategoryId() {
		return categoryId;
		}
	

		public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
		}
	

	@Column(name="MANDATORY_FLAG")

		private String mandatoryFlag;

		public String getMandatoryFlag() {
		return mandatoryFlag;
		}
	

		public void setMandatoryFlag(String mandatoryFlag) {
		this.mandatoryFlag = mandatoryFlag;
		}
	

	}
	
  
