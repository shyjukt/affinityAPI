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

import com.affinity.qas.domain.QaPersonalMast;
import com.affinity.qas.domain.QaEventUserTypeMast;
@Entity
@Table(name="QA_EVENT_USERS")

		
 
public class QaEventUsersVew {
  


	@Id 

	@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_EVENT_USER_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 


	@Column(name="EVENT_USER_ID")

		private Integer eventUserId;

		public Integer getEventUserId() {
		return eventUserId;
		}
	

		public void setEventUserId(Integer eventUserId) {
		this.eventUserId = eventUserId;
		}
	

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
	

	@Column(name="USER_TYPE")

		private String userType;

		public String getUserType() {
		return userType;
		}
	

		public void setUserType(String userType) {
		this.userType = userType;
		}
	

	@Column(name="ACCESS_TYPE")

		private Integer accessType;

		public Integer getAccessType() {
		return accessType;
		}
	

		public void setAccessType(Integer accessType) {
		this.accessType = accessType;
		}
	

	@Column(name="ADDED_BY")

		private Integer addedBy;

		public Integer getAddedBy() {
		return addedBy;
		}
	

		public void setAddedBy(Integer addedBy) {
		this.addedBy = addedBy;
		}
	

	@Column(name="ADDED_TIME")

		private Date addedTime;

		public Date getAddedTime() {
		return addedTime;
		}
	

		public void setAddedTime(Date addedTime) {
		this.addedTime = addedTime;
		}
	

	@Column(name="USER_MESSAGE")

		private String userMessage;

		public String getUserMessage() {
		return userMessage;
		}
	

		public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
		}
	

	@Column(name="ACCESSED_TIME")

		private Date accessedTime;

		public Date getAccessedTime() {
		return accessedTime;
		}
	

		public void setAccessedTime(Date accessedTime) {
		this.accessedTime = accessedTime;
		}
	

	@Column(name="DISPOSE_FLAG")

		private String disposeFlag;

		public String getDisposeFlag() {
		return disposeFlag;
		}
	

		public void setDisposeFlag(String disposeFlag) {
		this.disposeFlag = disposeFlag;
		}
	

	@Column(name="ACTIVE_FLAG")

		private String activeFlag;

		public String getActiveFlag() {
		return activeFlag;
		}
	

		public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
		}
	

		@ManyToOne(optional = false)
		@JoinColumn(name = "PERS_CODE" ,insertable = false, updatable = false) 
		private  QaPersonalMast qaPersonalMast;

			public QaPersonalMast getQaPersonalMast() {
			return qaPersonalMast;
		}

			public void setQaPersonalMast( QaPersonalMast qapersonalmast) {
			this.qaPersonalMast = qapersonalmast;
		}

		@ManyToOne(optional = false)
		@JoinColumn(name = "USER_TYPE" ,insertable = false, updatable = false) 
		private  QaEventUserTypeMast qaEventUserTypeMast;

			public QaEventUserTypeMast getQaEventUserTypeMast() {
			return qaEventUserTypeMast;
		}

			public void setQaEventUserTypeMast( QaEventUserTypeMast qaeventusertypemast) {
			this.qaEventUserTypeMast = qaeventusertypemast;
		}

	}
	
  
