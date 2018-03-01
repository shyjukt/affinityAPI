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
@Table(name="VEW_UTL_MENU_MAST")
 
public class VewUtlMenuMast {
  

		@Id 

	@Column(name="MENU_ID")

		private Integer menuId;

		public Integer getMenuId() {
		return menuId;
		}
	

		public void setMenuId(Integer menuId) {
		this.menuId = menuId;
		}
	

	@Column(name="MENU_NAME")

		private String menuName;

		public String getMenuName() {
		return menuName;
		}
	

		public void setMenuName(String menuName) {
		this.menuName = menuName;
		}
	

	@Column(name="PREV_MENU_ID")

		private Integer prevMenuId;

		public Integer getPrevMenuId() {
		return prevMenuId;
		}
	

		public void setPrevMenuId(Integer prevMenuId) {
		this.prevMenuId = prevMenuId;
		}
	

	@Column(name="ORDER_SEQ")

		private Integer orderSeq;

		public Integer getOrderSeq() {
		return orderSeq;
		}
	

		public void setOrderSeq(Integer orderSeq) {
		this.orderSeq = orderSeq;
		}
	

	@Column(name="MENU_ICON")

		private String menuIcon;

		public String getMenuIcon() {
		return menuIcon;
		}
	

		public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
		}
	

	@Column(name="MODULE_ID")

		private Integer moduleId;

		public Integer getModuleId() {
		return moduleId;
		}
	

		public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
		}
	

	@Column(name="MODULE_NAME")

		private String moduleName;

		public String getModuleName() {
		return moduleName;
		}
	

		public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		}
	

	}
	
  
