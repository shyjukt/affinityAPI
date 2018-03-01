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
@Table(name="QA_PARAMETER_MAST")
 
public class QaParameterMast {
  


		@Id 

	@Column(name="PARAMETER_ID")

		private Integer parameterId;

		public Integer getParameterId() {
		return parameterId;
		}
	

		public void setParameterId(Integer parameterId) {
		this.parameterId = parameterId;
		}
	

	@Column(name="PARAMETER_NAME")

		private String parameterName;

		public String getParameterName() {
		return parameterName;
		}
	

		public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
		}
	

	@Column(name="PREV_ID")

		private Integer prevId;

		public Integer getPrevId() {
		return prevId;
		}
	

		public void setPrevId(Integer prevId) {
		this.prevId = prevId;
		}
	

	@Column(name="PARAM_REMARKS")

		private String paramRemarks;

		public String getParamRemarks() {
		return paramRemarks;
		}
	

		public void setParamRemarks(String paramRemarks) {
		this.paramRemarks = paramRemarks;
		}
	

	}
	
  
