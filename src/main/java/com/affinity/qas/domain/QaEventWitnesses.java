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
@Table(name="QA_EVENT_WITNESSES")
 
public class QaEventWitnesses {
  


	@Column(name="EVENT_ID")

		private Integer eventId;

		public Integer getEventId() {
		return eventId;
		}
	

		public void setEventId(Integer eventId) {
		this.eventId = eventId;
		}
	

	@Column(name="PERS_CODE")

		private Integer persCode;

		public Integer getPersCode() {
		return persCode;
		}
	

		public void setPersCode(Integer persCode) {
		this.persCode = persCode;
		}
	

	@Column(name="REMARKS")

		private String remarks;

		public String getRemarks() {
		return remarks;
		}
	

		public void setRemarks(String remarks) {
		this.remarks = remarks;
		}
	

		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_WITNESS_ID", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="WITNESS_ID")

		private Integer witnessId;

		public Integer getWitnessId() {
		return witnessId;
		}
	

		public void setWitnessId(Integer witnessId) {
		this.witnessId = witnessId;
		}
	

	}
	
  
