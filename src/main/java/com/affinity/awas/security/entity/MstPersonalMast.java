package com.affinity.awas.security.entity; 

		
 
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="MST_PERSONAL_MAST")
 
public class MstPersonalMast {
  


		@Id 

	@Column(name="PERS_CODE")

		private Integer persCode;

		public Integer getPersCode() {
		return persCode;
		}
	

		public void setPersCode(Integer persCode) {
		this.persCode = persCode;
		}
	

	@Column(name="STAFF_NO")

		private String staffNo;

		public String getStaffNo() {
		return staffNo;
		}
	

		public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
		}
	

	@Column(name="PRINT_NAME")

		private String printName;

		public String getPrintName() {
		return printName;
		}
	

		public void setPrintName(String printName) {
		this.printName = printName;
		}
	

	@Column(name="NATIONALITY_CODE")

		private Integer nationalityCode;

		public Integer getNationalityCode() {
		return nationalityCode;
		}
	

		public void setNationalityCode(Integer nationalityCode) {
		this.nationalityCode = nationalityCode;
		}
	

	@Column(name="SEX_CODE")

		private String sexCode;

		public String getSexCode() {
		return sexCode;
		}
	

		public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
		}
	

	@Column(name="BIRTH_DATE")

		private Date birthDate;

		public Date getBirthDate() {
		return birthDate;
		}
	

		public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
		}
	

	@Column(name="CONTACT_ADDRESS")

		private String contactAddress;

		public String getContactAddress() {
		return contactAddress;
		}
	

		public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
		}
	

	@Column(name="MARITAL_STATUS_CODE")

		private String maritalStatusCode;

		public String getMaritalStatusCode() {
		return maritalStatusCode;
		}
	

		public void setMaritalStatusCode(String maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
		}
	

	@Column(name="WORK_STATUS")

		private Integer workStatus;

		public Integer getWorkStatus() {
		return workStatus;
		}
	

		public void setWorkStatus(Integer workStatus) {
		this.workStatus = workStatus;
		}
	

	@Column(name="OFFICIAL_MAIL_ID")

		private String officialMailId;

		public String getOfficialMailId() {
		return officialMailId;
		}
	

		public void setOfficialMailId(String officialMailId) {
		this.officialMailId = officialMailId;
		}
	

	@Column(name="GSM_NO")

		private String gsmNo;

		public String getGsmNo() {
		return gsmNo;
		}
	

		public void setGsmNo(String gsmNo) {
		this.gsmNo = gsmNo;
		}
	

	@Column(name="DESG_CODE")

		private Integer desgCode;

		public Integer getDesgCode() {
		return desgCode;
		}
	

		public void setDesgCode(Integer desgCode) {
		this.desgCode = desgCode;
		}
	

	@Column(name="NAME_SUFFIX")

		private String nameSuffix;

		public String getNameSuffix() {
		return nameSuffix;
		}
	

		public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
		}
	

	@Column(name="SALUTATION_CODE")

		private Integer salutationCode;

		public Integer getSalutationCode() {
		return salutationCode;
		}
	

		public void setSalutationCode(Integer salutationCode) {
		this.salutationCode = salutationCode;
		}
	

	@Column(name="LICENSE_NO")

		private String licenseNo;

		public String getLicenseNo() {
		return licenseNo;
		}
	

		public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
		}
	

	}
	
  
