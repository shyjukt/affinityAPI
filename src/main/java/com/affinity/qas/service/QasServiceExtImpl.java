package com.affinity.qas.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.affinity.awas.security.LoggedUserUtil;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.affinity.qas.domain.QaEventMessages;
import com.affinity.qas.domain.QaEventMessagesVew;
import com.affinity.qas.domain.QaEventUsers;
import com.affinity.qas.domain.QaEventUsersVew;
import com.affinity.qas.domain.QaEventWitnessesVew;
import com.affinity.qas.domain.QaEvents;
import com.affinity.qas.domain.QaEventsColl;
import com.affinity.qas.domain.QaEventsCollVew;
import com.affinity.qas.model.QaEventSearchCriteria;
import com.affinity.qas.repository.QaEventMessagesRepo;
import com.affinity.qas.repository.QaEventMessagesVewRepo;
import com.affinity.qas.repository.QaEventUsersRepo;
import com.affinity.qas.repository.QaEventUsersVewRepoExt;
import com.affinity.qas.repository.QaEventWitnessesVewRepo;
import com.affinity.qas.repository.QaEventsCollRepo;
import com.affinity.qas.repository.QaEventsCollVewRepo;
import com.affinity.qas.repository.QaEventsRepo;

import java.util.Date;
import java.sql.Types;


import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;

import com.fasterxml.jackson.annotation.JsonFormat;


@Service
public class QasServiceExtImpl implements QasServiceExt {

	@Autowired
	private JdbcTemplate jdbcTemplate;	

	@Autowired
	private EntityManager entityManager;

	private QaEventsRepo qaeventsRepo;
	@Autowired
    public void setQaEventsRepo (QaEventsRepo qaeventsRepo) {
        this.qaeventsRepo = qaeventsRepo;
    }
    
	
	private QaEventsCollRepo qaeventscollRepo;
	@Autowired
    public void setQaEventsCollRepo (QaEventsCollRepo qaeventscollRepo) {
        this.qaeventscollRepo = qaeventscollRepo;
    }
    
	private QaEventsCollVewRepo qaeventscollvewRepo;
	@Autowired
    public void setQaEventsCollVewRepo (QaEventsCollVewRepo qaeventscollvewRepo) {
        this.qaeventscollvewRepo = qaeventscollvewRepo;
    }
	
	private QaEventMessagesVewRepo qaeventmessagesvewRepo;
	@Autowired
    public void setQaEventMessagesVewRepo (QaEventMessagesVewRepo qaeventmessagesvewRepo) {
        this.qaeventmessagesvewRepo = qaeventmessagesvewRepo;
    }
    
 	private QaEventMessagesRepo qaeventmessagesRepo;
	@Autowired
    public void setQaEventMessagesRepo (QaEventMessagesRepo qaeventmessagesRepo) {
        this.qaeventmessagesRepo = qaeventmessagesRepo;
    }
	
	private QaEventUsersRepo qaeventusersRepo;
	@Autowired
    public void setQaEventUsersRepo (QaEventUsersRepo qaeventusersRepo) {
        this.qaeventusersRepo = qaeventusersRepo;
    }

	private QaEventUsersVewRepoExt qaeventusersvewRepoExt;
	@Autowired
    public void setQaEventUsersVewRepoExt (QaEventUsersVewRepoExt qaeventusersvewRepo) {
        this.qaeventusersvewRepoExt = qaeventusersvewRepo;
    }
 
	private QaEventWitnessesVewRepo qaeventwitnessesvewRepo;
	@Autowired
    public void setQaEventWitnessesVewRepo (QaEventWitnessesVewRepo qaeventwitnessesvewRepo) {
        this.qaeventwitnessesvewRepo = qaeventwitnessesvewRepo;
    }
    
	/////////////////////////////////////////////////////////
	
	@Override
	@Transactional
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	public QaEventsCollVew  createQaEvent(QaEventsColl qaeventscoll )
	{
		 Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
		 boolean msgFlag = false;
		 Date localDate =  new Date()  ;
	 		 
		  //assigning default values
		 qaeventscoll.setCreatedBy(persCode);
		 qaeventscoll.setCreatedTime(localDate);
		 
			for (int i = 0; i < qaeventscoll.getQaEventMessages().size(); i++) {
				System.out.println(qaeventscoll.getQaEventMessages().get(i));
				qaeventscoll.getQaEventMessages().get(i).setEntryUser(persCode);
				qaeventscoll.getQaEventMessages().get(i).setEntryTime( localDate );
				
				if (qaeventscoll.getQaEventMessages().get(i).getMsgType()=="I"  )
				{

					msgFlag = true;
				}
			}
			
/*
			if (msgFlag ==false )
			{
				System.out.println("***********No Event MessageS Passed **************");
				return null;
				
			}
*/			
	 
			// the users are not to be passed while creating the event.
			qaeventscoll.setQaEventUsers(null);
			
 
		  QaEventsColl  l = qaeventscollRepo.saveAndFlush(qaeventscoll );
		 
					//	entityManager.clear();
			return qaeventscollvewRepo.findOne(l.getEventId() );
	}
	
	@Override
	public List <QaEventsCollVew>  listQaEvents(QaEventSearchCriteria qaeventsearchcriteria )
			{
		
	    String jpql = "select p from QaEventsCollVew p "
	    		+ "where ( p.eventNo=:eventNo or :eventNo is null)"
	    		+ "and ( p.eventCategory=:eventCategory or :eventCategory is null)"
	    		+ "and ( p.eventSubCategory=:eventSubCategory or :eventSubCategory is null)"
	    		+ "and ( p.eventDept=:eventDept or :eventDept is null)"
	    		+ "and ( p.eventLocation=:eventLocation or :eventLocation is null)"
	    		+ "and ( p.eventStatus=:eventStatus or :eventStatus is null)"
				+ "and ( p.createdBy=:createdBy or :createdBy is null)"
				+ "and ( p.createdTime>=:fromDate or :fromDate is null)"
				+ "and ( p.createdTime<=:toDate or :toDate is null)"
	    		;
	     
	    Query query = entityManager.createQuery(jpql);

		query.setParameter("eventNo",qaeventsearchcriteria.getEventNo());
		query.setParameter("eventCategory",qaeventsearchcriteria.getEventCategory());		
		query.setParameter("eventSubCategory",qaeventsearchcriteria.getEventSubCategory());		
		query.setParameter("eventDept",qaeventsearchcriteria.getEventDept());
		query.setParameter("eventLocation",qaeventsearchcriteria.getEventLocation());		
		query.setParameter("eventStatus",qaeventsearchcriteria.getEventStatus());		
		query.setParameter("createdBy",qaeventsearchcriteria.getCreatedBy());		
		query.setParameter("fromDate",qaeventsearchcriteria.getFromTime());
		query.setParameter("toDate",qaeventsearchcriteria.getToTime());
		
		List <QaEventsCollVew>  result = query.getResultList();
	    	
     return result;

	}

	@Override
	@Transactional
	public List <QaEventUsersVew>  listQaEventUsersVew(Integer eventId )
	{
		return (List <QaEventUsersVew>) qaeventusersvewRepoExt.findByEventId(eventId);
	}

	///////////////////////////////////////////////////////////////////
	
	@Override
	@Transactional
	public QaEventUsersVew  createQaEventUser(QaEventUsers qaeventusers )	{	
		
		 Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
 	 		 
		  //assigning default values
		 qaeventusers.setAddedBy(persCode);
		 qaeventusers.setAddedTime( new Date() );
		 
		//ADDED_BY, ADDED_TIME
		
			QaEventUsers l = qaeventusersRepo.saveAndFlush(qaeventusers );
				entityManager.clear();
				return qaeventusersvewRepoExt.findOne(l.getEventUserId() );
		}
	

	@Override
	@Transactional
	public QaEventUsersVew  editQaEventUser(QaEventUsers qaEventUsers )
	{		
		QaEventUsers  l = qaeventusersRepo.saveAndFlush(qaEventUsers );
		entityManager.clear();
		return qaeventusersvewRepoExt.findOne(l.getEventUserId() );
	}
			
	@Override
	@Transactional
	public Integer  deleteQaEventUser(Integer eventUserId )				
	{ qaeventusersRepo.delete(eventUserId ); return 0;
	}
			

	@Override
	@Transactional
	public QaEventMessagesVew  createQaEventRecommendation(QaEventMessages qaeventmessages )	
			{			
		 		Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
	 		 
		 		//assigning default values
		 		qaeventmessages.setEntryUser(persCode); 
		 		qaeventmessages.setEntryTime( new Date() );
		 
				QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
					entityManager.clear();
				return qaeventmessagesvewRepo.findOne(l.getMessageId() );
		}
			
	@Override
	@Transactional
	public QaEventMessagesVew  createQaEventAction(QaEventMessages qaeventmessages )	{			
		
 		Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
		 
 		//assigning default values
 		qaeventmessages.setEntryUser(persCode); 
 		qaeventmessages.setEntryTime( new Date() );
 		QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
		entityManager.clear();
		return qaeventmessagesvewRepo.findOne(l.getMessageId() );
	}
			

	@Override
	@Transactional
	public QaEventMessagesVew  createQaEventConsequences(QaEventMessages qaeventmessages )	{
 		Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
		 
 		//assigning default values
 		qaeventmessages.setEntryUser(persCode); 
 		qaeventmessages.setEntryTime( new Date() );
 		QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
		entityManager.clear();
		return qaeventmessagesvewRepo.findOne(l.getMessageId() );
	}
			

	@Override
	@Transactional
	public QaEventMessagesVew  createQaEventComment(QaEventMessages qaeventmessages )	{
		Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
	 		 
 		//assigning default values
 		qaeventmessages.setEntryUser(persCode); 
 		qaeventmessages.setEntryTime( new Date() );
 		QaEventMessages l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
		entityManager.clear();
		return qaeventmessagesvewRepo.findOne(l.getMessageId() );
	}
			

	@Override
	@Transactional
	public QaEventMessagesVew  editQaEventDescription(QaEventMessages qaeventmessages )	
			{			QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
					entityManager.clear();
				return qaeventmessagesvewRepo.findOne(l.getMessageId() );
		}
///////
	
	@Override
	@Transactional
	public QaEventMessagesVew  editQaEventRecommendation(QaEventMessages qaeventmessages )	
			{			QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
					entityManager.clear();
				return qaeventmessagesvewRepo.findOne(l.getMessageId() );
		}
			
	@Override
	@Transactional
	public QaEventMessagesVew  editQaEventAction(QaEventMessages qaeventmessages )	
			{			QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
					entityManager.clear();
				return qaeventmessagesvewRepo.findOne(l.getMessageId() );
		}
			
	@Override
	@Transactional
	public QaEventMessagesVew  editQaEventConsequences(QaEventMessages qaeventmessages )	
	{			QaEventMessages  l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
				entityManager.clear();
				return qaeventmessagesvewRepo.findOne(l.getMessageId() );
	}
			
	@Override
	@Transactional
	public QaEventMessagesVew  editQaEventComment(QaEventMessages qaeventmessages )	
	{			QaEventMessages l = qaeventmessagesRepo.saveAndFlush(qaeventmessages );
				entityManager.clear();
				return qaeventmessagesvewRepo.findOne(l.getMessageId() );
	}
			
	@Override
	public QaEventWitnessesVew  getQaEventWitnesses(Integer witnessId )
			{return qaeventwitnessesvewRepo.findOne(witnessId );
		}
	
	@Override
	public List <QaEventWitnessesVew>  listQaEventWitnesses( Integer witnessId )
			{return (List <QaEventWitnessesVew>) qaeventwitnessesvewRepo.findAll( );
		}
	
	
	@Override
	@Transactional
	public QaEventsCollVew  editQaEventHdr(QaEvents qaevents )	
	{			QaEvents  l = qaeventsRepo.saveAndFlush(qaevents );
					entityManager.clear();
				return qaeventscollvewRepo.findOne(l.getEventId() );
	}
			
///=========================================================

	@Override
	@Transactional
	public QaEventsCollVew  approveQaEvent(Integer eventId )
	{
 
	 	 SimpleJdbcCall jdbcCall =  new SimpleJdbcCall(jdbcTemplate).withSchemaName("IERS")
				 .withFunctionName("iers_utils_approve_Event") ;
		 //.withCatalogName("IERS_UTILS")
	 	 //.withSchemaName("IERS")
		 	 Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;	
 		      jdbcCall.declareParameters(
		                new SqlOutParameter("RETURN", Types.INTEGER),
		                new SqlParameter("P_EVENT_ID", Types.INTEGER),
		                new SqlParameter("P_PERS_CODE", Types.INTEGER)
		    		  ); 
		 SqlParameterSource in = new MapSqlParameterSource().addValue("P_EVENT_ID",eventId) 
				 .addValue("P_PERS_CODE",persCode);


	        Integer result = jdbcCall.executeFunction(Integer.class, in);

		return qaeventscollvewRepo.findOne(result );
	} 
	
	
	@Override
	@Transactional
	public QaEventsCollVew  cancelEventApproval(Integer eventId )
	{
	 	 SimpleJdbcCall jdbcCall =  new SimpleJdbcCall(jdbcTemplate).withSchemaName("IERS") 
				 .withFunctionName("iers_utils_cancel_Evt_approval") ;
		 
		 	 Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;	
		 
		      jdbcCall.declareParameters(
		                new SqlOutParameter("RETURN", Types.INTEGER),
		                new SqlParameter("P_EVENT_ID", Types.INTEGER),
		                new SqlParameter("P_PERS_CODE", Types.INTEGER)		                
		    		  ); 
		 SqlParameterSource in = new MapSqlParameterSource().addValue("P_EVENT_ID",eventId) 
				 .addValue("P_PERS_CODE",persCode);


	        Integer result = jdbcCall.executeFunction(Integer.class, in);

		return qaeventscollvewRepo.findOne(result );
	} 
	

	
	@Override
	@Transactional
	public QaEventsCollVew  cancelQaEvent(Integer eventId )
	{
		 SimpleJdbcCall jdbcCall =  new SimpleJdbcCall(jdbcTemplate).withSchemaName("IERS") 
				 .withFunctionName("iers_utils_cancel_Event") ;
		 
		Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;
		 
jdbcCall.declareParameters(
	                new SqlOutParameter("RETURN", Types.INTEGER),
	                new SqlParameter("P_EVENT_ID", Types.INTEGER),
	                new SqlParameter("P_PERS_CODE", Types.INTEGER)		                
	  		); 

		
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_EVENT_ID",eventId).addValue("P_PERS_CODE",persCode);

 
Integer result =  jdbcCall.executeFunction(Integer.class, in);
	 	  if ( result != null )
 	 		  return qaeventscollvewRepo.findOne(result );
 	 	  else
	 	 	 return null;
	} 
	
	@Override
	@Transactional
	public QaEventsCollVew  closeQaEvent(Integer eventId )
	{
		 SimpleJdbcCall jdbcCall =  new SimpleJdbcCall(jdbcTemplate).withSchemaName("IERS") 
				 .withFunctionName("iers_utils_close_Event") ;
		 Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;	
		 
		 
		 jdbcCall.declareParameters(
	                new SqlOutParameter("RETURN", Types.INTEGER),
	                new SqlParameter("P_EVENT_ID", Types.INTEGER),
	                new SqlParameter("P_PERS_CODE", Types.INTEGER)		                
	  		); 

		 SqlParameterSource in = new MapSqlParameterSource().addValue("P_EVENT_ID",eventId).addValue("P_PERS_CODE",persCode);
	
	        Integer result =  jdbcCall.executeFunction(Integer.class, in);
		 	  if ( result != null )
	 	 		  return qaeventscollvewRepo.findOne(result );
	 	 	  else
		 	 	 return null;
	} 
	
	@Override
	@Transactional
	public QaEventsCollVew  reOpenQaEvent(Integer eventId )
	{
		 SimpleJdbcCall jdbcCall =  new SimpleJdbcCall(jdbcTemplate).withSchemaName("IERS") 
				 .withFunctionName("iers_utils_reOpen_Event") ; 
		 //.withCatalogName("IERS_UTILS")
		 Integer persCode =	LoggedUserUtil.getLoggedUser().getPersCode() ;	
		 
		 jdbcCall.declareParameters(
	                new SqlOutParameter("RETURN", Types.INTEGER),
	                new SqlParameter("P_EVENT_ID", Types.INTEGER),
	                new SqlParameter("P_PERS_CODE", Types.INTEGER)		                
	  		); 

		 SqlParameterSource in = new MapSqlParameterSource().addValue("P_EVENT_ID",eventId).addValue("P_PERS_CODE",persCode);
		 Integer result = jdbcCall.executeFunction(Integer.class, in);
	
	 	  if ( result != null )
 	 		  return qaeventscollvewRepo.findOne(result );
 	 	  else
	 	 	 return null;
	} 
		
}