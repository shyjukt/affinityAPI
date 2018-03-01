package com.affinity.awas.controller; 
		

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.security.access.prepost.PreAuthorize;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;
//	import org.springframework.web.bind.annotation.RequestBody;
//	import org.springframework.web.bind.annotation.RequestParam;		

	import java.util.List;
	

	import com.affinity.awas.security.service.MasterServiceExt;
	
	import com.affinity.awas.security.entity.VewUtlMenuMast;

	import com.affinity.awas.security.entity.MstPersonalMast;
	import com.affinity.awas.security.entity.UtlUserProcesses;

	@Controller
 
	public class MasterController  {
		 	 
 	public MasterServiceExt masterserviceextService  ;
    @Autowired
		 public void setMasterServiceExt (MasterServiceExt masterserviceext) {
		    this.masterserviceextService   = masterserviceext;
		 }
		 
	@PreAuthorize("hasRole('ROLE_listUserMenus')")
	@RequestMapping(value = "/listUserMenus", 	method = RequestMethod.GET)
    public @ResponseBody List <VewUtlMenuMast>  listUserMenus( )
	{
			return masterserviceextService.listUserMenus( );
	}
		
	@PreAuthorize("hasRole('ROLE_listSessionProcesses')")
	@RequestMapping(value = "/listSessionProcesses", 	method = RequestMethod.GET)
    public @ResponseBody List <UtlUserProcesses>  listSessionProcesses( )
	{
			return masterserviceextService.listSessionProcesses( );
	}
			
	@PreAuthorize("hasRole('ROLE_getSessionPerson')")
	@RequestMapping(value = "/getSessionPerson", 	method = RequestMethod.GET)
    public @ResponseBody MstPersonalMast  getSessionPerson( )
	{
			return masterserviceextService.getSessionPerson( );
	}
			
}

  
