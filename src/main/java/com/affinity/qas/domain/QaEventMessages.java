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
@Table(name="QA_EVENT_MESSAGES")
 
public class QaEventMessages {
  


		@Id 

		@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_QA_MESSAGE_ID", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")	 
	

	@Column(name="MESSAGE_ID")

		private Integer messageId;

		public Integer getMessageId() {
		return messageId;
		}
	

		public void setMessageId(Integer messageId) {
		this.messageId = messageId;
		}
	

	@Column(name="EVENT_ID")

		private Integer eventId;

		public Integer getEventId() {
		return eventId;
		}
	

		public void setEventId(Integer eventId) {
		this.eventId = eventId;
		}
	

	@Column(name="ENTRY_TIME")

		private Date entryTime;

		public Date getEntryTime() {
		return entryTime;
		}
	

		public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
		}
	

	@Column(name="ENTRY_USER")

		private Integer entryUser;

		public Integer getEntryUser() {
		return entryUser;
		}
	

		public void setEntryUser(Integer entryUser) {
		this.entryUser = entryUser;
		}
	

	@Column(name="MSG_DESC")

		private String msgDesc;

		public String getMsgDesc() {
		return msgDesc;
		}
	

		public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
		}
	

	@Column(name="MSG_TYPE")

		private String msgType;

		public String getMsgType() {
		return msgType;
		}
	

		public void setMsgType(String msgType) {
		this.msgType = msgType;
		}
	

	}
	
  
