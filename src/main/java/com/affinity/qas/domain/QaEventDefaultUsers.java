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
@Table(name="QA_EVENT_DEFAULT_USERS")
 
public class QaEventDefaultUsers {
  


	@Column(name="EVENT_CATEGORY")

		private Integer eventCategory;

		public Integer getEventCategory() {
		return eventCategory;
		}
	

		public void setEventCategory(Integer eventCategory) {
		this.eventCategory = eventCategory;
		}
	

	@Column(name="PERS_CODE")

		private Integer persCode;

		public Integer getPersCode() {
		return persCode;
		}
	

		public void setPersCode(Integer persCode) {
		this.persCode = persCode;
		}
	

		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_RUN_ID", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="RUN_ID")

		private Integer runId;

		public Integer getRunId() {
		return runId;
		}
	

		public void setRunId(Integer runId) {
		this.runId = runId;
		}
	

	}
	
  
