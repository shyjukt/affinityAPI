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

import com.affinity.qas.domain.QaEventStatusMast;
import com.affinity.qas.domain.QaEventDepartmentMast;
import com.affinity.qas.domain.QaEventLocationMast;
import com.affinity.qas.domain.QaCategoryMast;
import com.affinity.qas.domain.QaSubCategoryMast;
import com.affinity.qas.domain.QaEventWitnessesVew;
import com.affinity.qas.domain.QaEventMessagesVew;
import com.affinity.qas.domain.QaEventUsersVew;
import com.affinity.qas.domain.QaEventParametersVew;
@Entity
@Table(name="QA_EVENTS")

		
 
public class QaEventsCollVew {
  


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
	

		@ManyToOne(optional = false)
		@JoinColumn(name = "EVENT_STATUS" ,insertable = false, updatable = false) 
		private  QaEventStatusMast qaEventStatusMast;

			public QaEventStatusMast getQaEventStatusMast() {
			return qaEventStatusMast;
		}

			public void setQaEventStatusMast( QaEventStatusMast qaeventstatusmast) {
			this.qaEventStatusMast = qaeventstatusmast;
		}

		@ManyToOne(optional = false)
		@JoinColumn(name = "EVENT_DEPT" ,insertable = false, updatable = false) 
		private  QaEventDepartmentMast qaEventDepartmentMast;

			public QaEventDepartmentMast getQaEventDepartmentMast() {
			return qaEventDepartmentMast;
		}

			public void setQaEventDepartmentMast( QaEventDepartmentMast qaeventdepartmentmast) {
			this.qaEventDepartmentMast = qaeventdepartmentmast;
		}

		@ManyToOne(optional = false)
		@JoinColumn(name = "EVENT_LOCATION" ,insertable = false, updatable = false) 
		private  QaEventLocationMast qaEventLocationMast;

			public QaEventLocationMast getQaEventLocationMast() {
			return qaEventLocationMast;
		}

			public void setQaEventLocationMast( QaEventLocationMast qaeventlocationmast) {
			this.qaEventLocationMast = qaeventlocationmast;
		}

		@ManyToOne(optional = false)
		@JoinColumn(name = "EVENT_CATEGORY" ,insertable = false, updatable = false) 
		private  QaCategoryMast qaCategoryMast;

			public QaCategoryMast getQaCategoryMast() {
			return qaCategoryMast;
		}

			public void setQaCategoryMast( QaCategoryMast qacategorymast) {
			this.qaCategoryMast = qacategorymast;
		}

		@ManyToOne(optional = false)
		@JoinColumn(name = "EVENT_SUB_CATEGORY" ,insertable = false, updatable = false) 
		private  QaSubCategoryMast qaSubCategoryMast;

			public QaSubCategoryMast getQaSubCategoryMast() {
			return qaSubCategoryMast;
		}

			public void setQaSubCategoryMast( QaSubCategoryMast qasubcategorymast) {
			this.qaSubCategoryMast = qasubcategorymast;
		}

		@OneToMany( targetEntity=QaEventWitnessesVew.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventWitnessesVew> qaEventWitnessesVew;

			public List<QaEventWitnessesVew> getQaEventWitnessesVew() {
			return qaEventWitnessesVew;
		}

			public void setQaEventWitnessesVew(List<QaEventWitnessesVew> qaeventwitnessesvew) {
			this.qaEventWitnessesVew = qaeventwitnessesvew;
		}

		@OneToMany( targetEntity=QaEventMessagesVew.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventMessagesVew> qaEventMessagesVew;

			public List<QaEventMessagesVew> getQaEventMessagesVew() {
			return qaEventMessagesVew;
		}

			public void setQaEventMessagesVew(List<QaEventMessagesVew> qaeventmessagesvew) {
			this.qaEventMessagesVew = qaeventmessagesvew;
		}

		@OneToMany( targetEntity=QaEventUsersVew.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventUsersVew> qaEventUsersVew;

			public List<QaEventUsersVew> getQaEventUsersVew() {
			return qaEventUsersVew;
		}

			public void setQaEventUsersVew(List<QaEventUsersVew> qaeventusersvew) {
			this.qaEventUsersVew = qaeventusersvew;
		}

		@OneToMany( targetEntity=QaEventParametersVew.class,   fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "EVENT_ID") 
		private List<QaEventParametersVew> qaEventParametersVew;

			public List<QaEventParametersVew> getQaEventParametersVew() {
			return qaEventParametersVew;
		}

			public void setQaEventParametersVew(List<QaEventParametersVew> qaeventparametersvew) {
			this.qaEventParametersVew = qaeventparametersvew;
		}

	}
	
  
