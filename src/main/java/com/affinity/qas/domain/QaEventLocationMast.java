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
@Table(name="QA_EVENT_LOCATION_MAST")
 
public class QaEventLocationMast {
  


		@Id 

	@Column(name="LOCATION_CODE")

		private Integer locationCode;

		public Integer getLocationCode() {
		return locationCode;
		}
	

		public void setLocationCode(Integer locationCode) {
		this.locationCode = locationCode;
		}
	

	@Column(name="LOCATION_NAME")

		private String locationName;

		public String getLocationName() {
		return locationName;
		}
	

		public void setLocationName(String locationName) {
		this.locationName = locationName;
		}
	

	@Column(name="ACTIVE_YN")

		private String activeYn;

		public String getActiveYn() {
		return activeYn;
		}
	

		public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
		}
	

	}
	
  
