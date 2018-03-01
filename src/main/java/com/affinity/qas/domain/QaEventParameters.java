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
@Table(name="QA_EVENT_PARAMETERS")
 
public class QaEventParameters {
  


		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_EVENT_PARAM_ID", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="EVENT_PARAM_ID")

		private Integer eventParamId;

		public Integer getEventParamId() {
		return eventParamId;
		}
	

		public void setEventParamId(Integer eventParamId) {
		this.eventParamId = eventParamId;
		}
	

	@Column(name="EVENT_ID")

		private Integer eventId;

		public Integer getEventId() {
		return eventId;
		}
	

		public void setEventId(Integer eventId) {
		this.eventId = eventId;
		}
	

	@Column(name="PARAM_ID")

		private Integer paramId;

		public Integer getParamId() {
		return paramId;
		}
	

		public void setParamId(Integer paramId) {
		this.paramId = paramId;
		}
	

	@Column(name="PARAM_VALUE")

		private String paramValue;

		public String getParamValue() {
		return paramValue;
		}
	

		public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
		}
	

	}
	
  
