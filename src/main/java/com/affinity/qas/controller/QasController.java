package com.affinity.qas.controller; 
		

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.security.access.prepost.PreAuthorize;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;		

	import java.util.List;
	
	
	import com.affinity.qas.service.QasService;
	import com.affinity.qas.service.QasServiceExt;
	import com.affinity.qas.domain.QaPersonalMast;
	import com.affinity.qas.domain.QaEventUsers;
	import com.affinity.qas.domain.QaEventDefaultUsers;
	import com.affinity.qas.domain.QaEventLocationUsers;
	import com.affinity.qas.domain.QaEventWitnessesVew;
	import com.affinity.qas.domain.QaEventMessages;
	import com.affinity.qas.domain.QaEventDepartmentMast;
	import com.affinity.qas.domain.QaEventMessagesVew;
	import com.affinity.qas.domain.QaEventWitnesses;
	import com.affinity.qas.domain.QaEventUsersVew;
	import com.affinity.qas.domain.QaEventsColl;
	import com.affinity.qas.domain.QaSubCategoryMast;
	import com.affinity.qas.domain.QaEvents;
	import com.affinity.qas.domain.QaEventsCollVew;
	import com.affinity.qas.domain.QaEventParameters;
	import com.affinity.qas.domain.QaEventLocationMast;
	import com.affinity.qas.domain.QaCategoryMast;
	import com.affinity.qas.model.QaEventSearchCriteria;

	@Controller
 
	public class QasController  {
	
 	public QasService  qasService  ;
    @Autowired
		 public void setQasService (QasService qas) {
		    this.qasService   = qas;
		 }
		 
 	public QasServiceExt qasserviceextService  ;
    @Autowired
		 public void setQasServiceExt (QasServiceExt qasserviceext) {
		    this.qasserviceextService   = qasserviceext;
		 }
		 
	@PreAuthorize("hasRole('ROLE_createQaEvent')")
	@RequestMapping(value = "/createQaEvent", 	method = RequestMethod.POST)
    public @ResponseBody QaEventsCollVew  createQaEvent(@RequestBody QaEventsColl qaeventscoll )
	{
			return qasserviceextService.createQaEvent(qaeventscoll );
	}
			
	@PreAuthorize("hasRole('ROLE_getQaEventLocationUsers')")
	@RequestMapping(value = "/getQaEventLocationUsers", 	method = RequestMethod.GET)
    public @ResponseBody QaEventLocationUsers  getQaEventLocationUsers(@RequestParam Integer runId )
	{
			return qasService.getQaEventLocationUsers(runId );
	}
		
	@PreAuthorize("hasRole('ROLE_getQaEventDefaultUsers')")
	@RequestMapping(value = "/getQaEventDefaultUsers", 	method = RequestMethod.GET)
    public @ResponseBody QaEventDefaultUsers  getQaEventDefaultUsers(@RequestParam Integer runId )
	{
			return qasService.getQaEventDefaultUsers(runId );
	}
		
	@PreAuthorize("hasRole('ROLE_getQaEventParameters')")
	@RequestMapping(value = "/getQaEventParameters", 	method = RequestMethod.GET)
    public @ResponseBody QaEventParameters  getQaEventParameters(@RequestParam Integer eventParamId )
	{
			return qasService.getQaEventParameters(eventParamId );
	}
		
	@PreAuthorize("hasRole('ROLE_getQaEventUser')")
	@RequestMapping(value = "/getQaEventUser", 	method = RequestMethod.GET)
    public @ResponseBody QaEventUsers  getQaEventUser(@RequestParam Integer eventUserId )
	{
			return qasService.getQaEventUser(eventUserId );
	}
		
	@PreAuthorize("hasRole('ROLE_getQaSubCategoryMast')")
	@RequestMapping(value = "/getQaSubCategoryMast", 	method = RequestMethod.GET)
    public @ResponseBody QaSubCategoryMast  getQaSubCategoryMast(@RequestParam Integer subCatCode )
	{
			return qasService.getQaSubCategoryMast(subCatCode );
	}
		
	@PreAuthorize("hasRole('ROLE_getQaCategoryMast')")
	@RequestMapping(value = "/getQaCategoryMast", 	method = RequestMethod.GET)
    public @ResponseBody QaCategoryMast  getQaCategoryMast(@RequestParam Integer categoryCode )
	{
			return qasService.getQaCategoryMast(categoryCode );
	}
		
	@PreAuthorize("hasRole('ROLE_deleteQaEventLocationUsers')")
	@RequestMapping(value = "/deleteQaEventLocationUsers", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaEventLocationUsers(@RequestParam Integer runId )
	{
			return qasService.deleteQaEventLocationUsers(runId );
	}
		
	@PreAuthorize("hasRole('ROLE_deleteQaEventDefaultUsers')")
	@RequestMapping(value = "/deleteQaEventDefaultUsers", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaEventDefaultUsers(@RequestParam Integer runId )
	{
			return qasService.deleteQaEventDefaultUsers(runId );
	}
		
	@PreAuthorize("hasRole('ROLE_deleteQaEventWitnesses')")
	@RequestMapping(value = "/deleteQaEventWitnesses", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaEventWitnesses(@RequestParam Integer witnessId )
	{
			return qasService.deleteQaEventWitnesses(witnessId );
	}
		
	@PreAuthorize("hasRole('ROLE_deleteQaEventParameters')")
	@RequestMapping(value = "/deleteQaEventParameters", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaEventParameters(@RequestParam Integer eventParamId )
	{
			return qasService.deleteQaEventParameters(eventParamId );
	}
		
	@PreAuthorize("hasRole('ROLE_deleteQaEventUser')")
	@RequestMapping(value = "/deleteQaEventUser", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaEventUser(@RequestParam Integer eventUserId )
	{
			return qasserviceextService.deleteQaEventUser(eventUserId );
	}
			
	@PreAuthorize("hasRole('ROLE_deleteQaCategoryMast')")
	@RequestMapping(value = "/deleteQaCategoryMast", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaCategoryMast(@RequestParam Integer categoryCode )
	{
			return qasService.deleteQaCategoryMast(categoryCode );
	}
		
	@PreAuthorize("hasRole('ROLE_deleteQaSubCategoryMast')")
	@RequestMapping(value = "/deleteQaSubCategoryMast", 	method = RequestMethod.DELETE)
    public @ResponseBody Integer  deleteQaSubCategoryMast(@RequestParam Integer subCatCode )
	{
			return qasService.deleteQaSubCategoryMast(subCatCode );
	}
		
	@PreAuthorize("hasRole('ROLE_getQaEvent')")
	@RequestMapping(value = "/getQaEvent", 	method = RequestMethod.GET)
    public @ResponseBody QaEventsCollVew  getQaEvent(@RequestParam Integer eventId )
	{
			return qasService.getQaEvent(eventId );
	}
		
	@PreAuthorize("hasRole('ROLE_reOpenQaEvent')")
	@RequestMapping(value = "/reOpenQaEvent", 	method = RequestMethod.GET)
    public @ResponseBody QaEventsCollVew  reOpenQaEvent(@RequestParam Integer eventId )
	{
			return qasserviceextService.reOpenQaEvent(eventId );
	}
			
	@PreAuthorize("hasRole('ROLE_closeQaEvent')")
	@RequestMapping(value = "/closeQaEvent", 	method = RequestMethod.GET)
    public @ResponseBody QaEventsCollVew  closeQaEvent(@RequestParam Integer eventId )
	{
			return qasserviceextService.closeQaEvent(eventId );
	}
			
	@PreAuthorize("hasRole('ROLE_cancelQaEvent')")
	@RequestMapping(value = "/cancelQaEvent", 	method = RequestMethod.GET)
    public @ResponseBody QaEventsCollVew  cancelQaEvent(@RequestParam Integer eventId )
	{
			return qasserviceextService.cancelQaEvent(eventId );
	}
			
	@PreAuthorize("hasRole('ROLE_approveQaEvent')")
	@RequestMapping(value = "/approveQaEvent", 	method = RequestMethod.GET)
    public @ResponseBody QaEventsCollVew  approveQaEvent(@RequestParam Integer eventId )
	{
			return qasserviceextService.approveQaEvent(eventId );
	}
			
	@PreAuthorize("hasRole('ROLE_listQaEventUsersVew')")
	@RequestMapping(value = "/listQaEventUsersVew", 	method = RequestMethod.GET)
    public @ResponseBody List <QaEventUsersVew>  listQaEventUsersVew(@RequestParam Integer eventId )
	{
			return qasserviceextService.listQaEventUsersVew(eventId );
	}
			
	@PreAuthorize("hasRole('ROLE_getQaEventWitnesses')")
	@RequestMapping(value = "/getQaEventWitnesses", 	method = RequestMethod.GET)
    public @ResponseBody QaEventWitnessesVew  getQaEventWitnesses(@RequestParam Integer witnessId )
	{
			return qasserviceextService.getQaEventWitnesses(witnessId );
	}
			
	@PreAuthorize("hasRole('ROLE_listQaEventWitnesses')")
	@RequestMapping(value = "/listQaEventWitnesses", 	method = RequestMethod.GET)
    public @ResponseBody List <QaEventWitnessesVew>  listQaEventWitnesses(@RequestParam Integer witnessId )
	{
			return qasserviceextService.listQaEventWitnesses(witnessId );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventHdr')")
	@RequestMapping(value = "/editQaEventHdr", 	method = RequestMethod.POST)
    public @ResponseBody QaEventsCollVew  editQaEventHdr(@RequestBody QaEvents qaevents )
	{
			return qasserviceextService.editQaEventHdr(qaevents );
	}
			
	@PreAuthorize("hasRole('ROLE_createQaCategoryMast')")
	@RequestMapping(value = "/createQaCategoryMast", 	method = RequestMethod.POST)
    public @ResponseBody QaCategoryMast  createQaCategoryMast(@RequestBody QaCategoryMast qacategorymast )
	{
			return qasService.createQaCategoryMast(qacategorymast );
	}
		
	@PreAuthorize("hasRole('ROLE_editQaCategoryMast')")
	@RequestMapping(value = "/editQaCategoryMast", 	method = RequestMethod.POST)
    public @ResponseBody QaCategoryMast  editQaCategoryMast(@RequestBody QaCategoryMast qacategorymast )
	{
			return qasService.editQaCategoryMast(qacategorymast );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaCategoryMast')")
	@RequestMapping(value = "/listQaCategoryMast", 	method = RequestMethod.POST)
    public @ResponseBody List <QaCategoryMast>  listQaCategoryMast(@RequestBody QaCategoryMast qacategorymast )
	{
			return qasService.listQaCategoryMast(qacategorymast );
	}
		
	@PreAuthorize("hasRole('ROLE_createQaSubCategoryMast')")
	@RequestMapping(value = "/createQaSubCategoryMast", 	method = RequestMethod.POST)
    public @ResponseBody QaSubCategoryMast  createQaSubCategoryMast(@RequestBody QaSubCategoryMast qasubcategorymast )
	{
			return qasService.createQaSubCategoryMast(qasubcategorymast );
	}
		
	@PreAuthorize("hasRole('ROLE_editQaSubCategoryMast')")
	@RequestMapping(value = "/editQaSubCategoryMast", 	method = RequestMethod.POST)
    public @ResponseBody QaSubCategoryMast  editQaSubCategoryMast(@RequestBody QaSubCategoryMast qasubcategorymast )
	{
			return qasService.editQaSubCategoryMast(qasubcategorymast );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaSubCategoryMast')")
	@RequestMapping(value = "/listQaSubCategoryMast", 	method = RequestMethod.POST)
    public @ResponseBody List <QaSubCategoryMast>  listQaSubCategoryMast(@RequestBody QaSubCategoryMast qasubcategorymast )
	{
			return qasService.listQaSubCategoryMast(qasubcategorymast );
	}
		
	@PreAuthorize("hasRole('ROLE_editQaEventDescription')")
	@RequestMapping(value = "/editQaEventDescription", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  editQaEventDescription(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.editQaEventDescription(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_createQaEventComment')")
	@RequestMapping(value = "/createQaEventComment", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  createQaEventComment(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.createQaEventComment(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_createQaEventConsequences')")
	@RequestMapping(value = "/createQaEventConsequences", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  createQaEventConsequences(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.createQaEventConsequences(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_createQaEventAction')")
	@RequestMapping(value = "/createQaEventAction", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  createQaEventAction(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.createQaEventAction(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_createQaEventRecommendation')")
	@RequestMapping(value = "/createQaEventRecommendation", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  createQaEventRecommendation(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.createQaEventRecommendation(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventComment')")
	@RequestMapping(value = "/editQaEventComment", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  editQaEventComment(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.editQaEventComment(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventConsequences')")
	@RequestMapping(value = "/editQaEventConsequences", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  editQaEventConsequences(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.editQaEventConsequences(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventAction')")
	@RequestMapping(value = "/editQaEventAction", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  editQaEventAction(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.editQaEventAction(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventRecommendation')")
	@RequestMapping(value = "/editQaEventRecommendation", 	method = RequestMethod.POST)
    public @ResponseBody QaEventMessagesVew  editQaEventRecommendation(@RequestBody QaEventMessages qaeventmessages )
	{
			return qasserviceextService.editQaEventRecommendation(qaeventmessages );
	}
			
	@PreAuthorize("hasRole('ROLE_createQaEventUser')")
	@RequestMapping(value = "/createQaEventUser", 	method = RequestMethod.POST)
    public @ResponseBody QaEventUsersVew  createQaEventUser(@RequestBody QaEventUsers qaeventusers )
	{
			return qasserviceextService.createQaEventUser(qaeventusers );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventUser')")
	@RequestMapping(value = "/editQaEventUser", 	method = RequestMethod.POST)
    public @ResponseBody QaEventUsersVew  editQaEventUser(@RequestBody QaEventUsers qaeventusers )
	{
			return qasserviceextService.editQaEventUser(qaeventusers );
	}
			
	@PreAuthorize("hasRole('ROLE_editQaEventParameters')")
	@RequestMapping(value = "/editQaEventParameters", 	method = RequestMethod.POST)
    public @ResponseBody QaEventParameters  editQaEventParameters(@RequestBody QaEventParameters qaeventparameters )
	{
			return qasService.editQaEventParameters(qaeventparameters );
	}
		
	@PreAuthorize("hasRole('ROLE_createQaEventParameters')")
	@RequestMapping(value = "/createQaEventParameters", 	method = RequestMethod.POST)
    public @ResponseBody QaEventParameters  createQaEventParameters(@RequestBody QaEventParameters qaeventparameters )
	{
			return qasService.createQaEventParameters(qaeventparameters );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaEventParameters')")
	@RequestMapping(value = "/listQaEventParameters", 	method = RequestMethod.POST)
    public @ResponseBody List <QaEventParameters>  listQaEventParameters(@RequestBody QaEventParameters qaeventparameters )
	{
			return qasService.listQaEventParameters(qaeventparameters );
	}
		
	@PreAuthorize("hasRole('ROLE_createQaEventWitnesses')")
	@RequestMapping(value = "/createQaEventWitnesses", 	method = RequestMethod.POST)
    public @ResponseBody QaEventWitnesses  createQaEventWitnesses(@RequestBody QaEventWitnesses qaeventwitnesses )
	{
			return qasService.createQaEventWitnesses(qaeventwitnesses );
	}
		
	@PreAuthorize("hasRole('ROLE_editQaEventWitnesses')")
	@RequestMapping(value = "/editQaEventWitnesses", 	method = RequestMethod.POST)
    public @ResponseBody QaEventWitnesses  editQaEventWitnesses(@RequestBody QaEventWitnesses qaeventwitnesses )
	{
			return qasService.editQaEventWitnesses(qaeventwitnesses );
	}
		
	@PreAuthorize("hasRole('ROLE_createQaEventDefaultUsers')")
	@RequestMapping(value = "/createQaEventDefaultUsers", 	method = RequestMethod.POST)
    public @ResponseBody QaEventDefaultUsers  createQaEventDefaultUsers(@RequestBody QaEventDefaultUsers qaeventdefaultusers )
	{
			return qasService.createQaEventDefaultUsers(qaeventdefaultusers );
	}
		
	@PreAuthorize("hasRole('ROLE_editQaEventDefaultUsers')")
	@RequestMapping(value = "/editQaEventDefaultUsers", 	method = RequestMethod.POST)
    public @ResponseBody QaEventDefaultUsers  editQaEventDefaultUsers(@RequestBody QaEventDefaultUsers qaeventdefaultusers )
	{
			return qasService.editQaEventDefaultUsers(qaeventdefaultusers );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaEventDefaultUsers')")
	@RequestMapping(value = "/listQaEventDefaultUsers", 	method = RequestMethod.POST)
    public @ResponseBody List <QaEventDefaultUsers>  listQaEventDefaultUsers(@RequestBody QaEventDefaultUsers qaeventdefaultusers )
	{
			return qasService.listQaEventDefaultUsers(qaeventdefaultusers );
	}
		
	@PreAuthorize("hasRole('ROLE_createQaEventLocationUsers')")
	@RequestMapping(value = "/createQaEventLocationUsers", 	method = RequestMethod.POST)
    public @ResponseBody QaEventLocationUsers  createQaEventLocationUsers(@RequestBody QaEventLocationUsers qaeventlocationusers )
	{
			return qasService.createQaEventLocationUsers(qaeventlocationusers );
	}
		
	@PreAuthorize("hasRole('ROLE_editQaEventLocationUsers')")
	@RequestMapping(value = "/editQaEventLocationUsers", 	method = RequestMethod.POST)
    public @ResponseBody QaEventLocationUsers  editQaEventLocationUsers(@RequestBody QaEventLocationUsers qaeventlocationusers )
	{
			return qasService.editQaEventLocationUsers(qaeventlocationusers );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaEventLocationUsers')")
	@RequestMapping(value = "/listQaEventLocationUsers", 	method = RequestMethod.POST)
    public @ResponseBody List <QaEventLocationUsers>  listQaEventLocationUsers(@RequestBody QaEventLocationUsers qaeventlocationusers )
	{
			return qasService.listQaEventLocationUsers(qaeventlocationusers );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaEvents')")
	@RequestMapping(value = "/listQaEvents", 	method = RequestMethod.POST)
    public @ResponseBody List <QaEventsCollVew>  listQaEvents(@RequestBody QaEventSearchCriteria qaeventsearchcriteria )
	{
			return qasserviceextService.listQaEvents(qaeventsearchcriteria );
	}
			
	@PreAuthorize("hasRole('ROLE_listQaPersonalMast')")
	@RequestMapping(value = "/listQaPersonalMast", 	method = RequestMethod.GET)
    public @ResponseBody List <QaPersonalMast>  listQaPersonalMast( )
	{
			return qasService.listQaPersonalMast( );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaLocations')")
	@RequestMapping(value = "/listQaLocations", 	method = RequestMethod.GET)
    public @ResponseBody List <QaEventLocationMast>  listQaLocations( )
	{
			return qasService.listQaLocations( );
	}
		
	@PreAuthorize("hasRole('ROLE_listQaDepartments')")
	@RequestMapping(value = "/listQaDepartments", 	method = RequestMethod.GET)
    public @ResponseBody List <QaEventDepartmentMast>  listQaDepartments( )
	{
			return qasService.listQaDepartments( );
	}
		
 
}

  
