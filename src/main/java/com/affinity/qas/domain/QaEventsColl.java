package com.affinity.qas.domain; 

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.affinity.qas.domain.QaEventMessages;
import com.affinity.qas.domain.QaEventUsers;
import com.affinity.qas.domain.QaEventWitnesses;
import com.affinity.qas.domain.QaEventParameters;
@Entity
@Table(name="QA_EVENTS")

		
 
public class QaEventsColl {
  


	@Id 

	@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_EVENT_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 


	@Column(name="EVENT_ID")

		private Integer eventId;

		public Integer getEventId() {
		return eventId;
		}
	

		public void setEventId(Integer eventId) {
		this.eventId = eventId;
		}
	

	@Column(name="EVENT_NO")

		private String eventNo;

		public String getEventNo() {
		return eventNo;
		}
	

		public void setEventNo(String eventNo) {
		this.eventNo = eventNo;
		}
	

	@Column(name="EVENT_CATEGORY")

		private Integer eventCategory;

		public Integer getEventCategory() {
		return eventCategory;
		}
	

		public void setEventCategory(Integer eventCategory) {
		this.eventCategory = eventCategory;
		}
	

	@Column(name="EVENT_SUB_CATEGORY")

		private Integer eventSubCategory;

		public Integer getEventSubCategory() {
		return eventSubCategory;
		}
	

		public void setEventSubCategory(Integer eventSubCategory) {
		this.eventSubCategory = eventSubCategory;
		}
	

	@Column(name="EVENT_LOCATION")

		private Integer eventLocation;

		public Integer getEventLocation() {
		return eventLocation;
		}
	

		public void setEventLocation(Integer eventLocation) {
		this.eventLocation = eventLocation;
		}
	

	@Column(name="EVENT_DEPT")

		private Integer eventDept;

		public Integer getEventDept() {
		return eventDept;
		}
	

		public void setEventDept(Integer eventDept) {
		this.eventDept = eventDept;
		}
	

	@Column(name="EVENT_TIME")

		private Date eventTime;

		public Date getEventTime() {
		return eventTime;
		}
	

		public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
		}
	

	@Column(name="EVENT_STATUS")

		private Integer eventStatus;

		public Integer getEventStatus() {
		return eventStatus;
		}
	

		public void setEventStatus(Integer eventStatus) {
		this.eventStatus = eventStatus;
		}
	

	@Column(name="CREATED_BY")

		private Integer createdBy;

		public Integer getCreatedBy() {
		return createdBy;
		}
	

		public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
		}
	

	@Column(name="CREATED_TIME")

		private Date createdTime;

		public Date getCreatedTime() {
		return createdTime;
		}
	

		public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
		}
	

	@Column(name="EST_CODE")

		private Integer estCode;

		public Integer getEstCode() {
		return estCode;
		}
	

		public void setEstCode(Integer estCode) {
		this.estCode = estCode;
		}
	

		@OneToMany( targetEntity=QaEventMessages.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventMessages> qaEventMessages;

			public List<QaEventMessages> getQaEventMessages() {
			return qaEventMessages;
		}

			public void setQaEventMessages(List<QaEventMessages> qaeventmessages) {
			this.qaEventMessages = qaeventmessages;
		}

		@OneToMany( targetEntity=QaEventUsers.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventUsers> qaEventUsers;

			public List<QaEventUsers> getQaEventUsers() {
			return qaEventUsers;
		}

			public void setQaEventUsers(List<QaEventUsers> qaeventusers) {
			this.qaEventUsers = qaeventusers;
		}

		@OneToMany( targetEntity=QaEventWitnesses.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventWitnesses> qaEventWitnesses;

			public List<QaEventWitnesses> getQaEventWitnesses() {
			return qaEventWitnesses;
		}

			public void setQaEventWitnesses(List<QaEventWitnesses> qaeventwitnesses) {
			this.qaEventWitnesses = qaeventwitnesses;
		}

		@OneToMany( targetEntity=QaEventParameters.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventParameters> qaEventParameters;

			public List<QaEventParameters> getQaEventParameters() {
			return qaEventParameters;
		}

			public void setQaEventParameters(List<QaEventParameters> qaeventparameters) {
			this.qaEventParameters = qaeventparameters;
		}

	}
	
  
