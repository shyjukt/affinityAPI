package com.affinity.qas.service; 

		
 		
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;
import com.affinity.qas.domain.QaPersonalMast;
import com.affinity.qas.domain.QaEventUsers;
import com.affinity.qas.domain.QaEventDefaultUsers;
import com.affinity.qas.domain.QaEventLocationUsers;
import com.affinity.qas.domain.QaEventDepartmentMast;
import com.affinity.qas.domain.QaEventWitnesses;
import com.affinity.qas.domain.QaSubCategoryMast;
import com.affinity.qas.domain.QaEventsCollVew;
import com.affinity.qas.domain.QaEventParameters;
import com.affinity.qas.domain.QaEventLocationMast;
import com.affinity.qas.domain.QaCategoryMast;
import com.affinity.qas.model.QaEventSearchCriteria;
import com.affinity.qas.repository.QaEventsCollRepo;
import com.affinity.qas.repository.QaEventsVewRepo;
import com.affinity.qas.repository.QaEventDepartmentMastRepo;
import com.affinity.qas.repository.QaEventLocationMastRepo;
import com.affinity.qas.repository.QaPersonalMastRepo;
import com.affinity.qas.repository.QaEventWitnessesVewRepo;
import com.affinity.qas.repository.QaEventMessagesVewRepo;
import com.affinity.qas.repository.QaEventUsersVewRepo;
import com.affinity.qas.repository.QaEventParametersVewRepo;
import com.affinity.qas.repository.QaEventsCollVewRepo;
import com.affinity.qas.repository.QaEventsRepo;
import com.affinity.qas.repository.QaEventStatusMastRepo;
import com.affinity.qas.repository.QaCategoryMastRepo;
import com.affinity.qas.repository.QaSubCategoryMastRepo;
import com.affinity.qas.repository.QaEventMessagesRepo;
import com.affinity.qas.repository.QaEventUsersRepo;
import com.affinity.qas.repository.QaEventUserTypeMastRepo;
import com.affinity.qas.repository.QaEventAccessTypeMastRepo;
import com.affinity.qas.repository.QaEventParametersRepo;
import com.affinity.qas.repository.QaParameterMastRepo;
import com.affinity.qas.repository.QaParameterCategoryLinkRepo;
import com.affinity.qas.repository.QaMessageTypeMastRepo;
import com.affinity.qas.repository.QaEventWitnessesRepo;
import com.affinity.qas.repository.QaEventDefaultUsersRepo;
import com.affinity.qas.repository.QaEventLocationUsersRepo;
 
@Service
 
public class QasServiceImpl  implements QasService {

	@Autowired
	private EntityManager entityManager;


 
	private QaEventsCollRepo qaeventscollRepo;
	@Autowired
    public void setQaEventsCollRepo (QaEventsCollRepo qaeventscollRepo) {
        this.qaeventscollRepo = qaeventscollRepo;
    }
    
 
	private QaEventsVewRepo qaeventsvewRepo;
	@Autowired
    public void setQaEventsVewRepo (QaEventsVewRepo qaeventsvewRepo) {
        this.qaeventsvewRepo = qaeventsvewRepo;
    }
    
 
	private QaEventDepartmentMastRepo qaeventdepartmentmastRepo;
	@Autowired
    public void setQaEventDepartmentMastRepo (QaEventDepartmentMastRepo qaeventdepartmentmastRepo) {
        this.qaeventdepartmentmastRepo = qaeventdepartmentmastRepo;
    }
    
 
	private QaEventLocationMastRepo qaeventlocationmastRepo;
	@Autowired
    public void setQaEventLocationMastRepo (QaEventLocationMastRepo qaeventlocationmastRepo) {
        this.qaeventlocationmastRepo = qaeventlocationmastRepo;
    }
    
 
	private QaPersonalMastRepo qapersonalmastRepo;
	@Autowired
    public void setQaPersonalMastRepo (QaPersonalMastRepo qapersonalmastRepo) {
        this.qapersonalmastRepo = qapersonalmastRepo;
    }
    
 
	private QaEventWitnessesVewRepo qaeventwitnessesvewRepo;
	@Autowired
    public void setQaEventWitnessesVewRepo (QaEventWitnessesVewRepo qaeventwitnessesvewRepo) {
        this.qaeventwitnessesvewRepo = qaeventwitnessesvewRepo;
    }
    
 
	private QaEventMessagesVewRepo qaeventmessagesvewRepo;
	@Autowired
    public void setQaEventMessagesVewRepo (QaEventMessagesVewRepo qaeventmessagesvewRepo) {
        this.qaeventmessagesvewRepo = qaeventmessagesvewRepo;
    }
    
 
	private QaEventUsersVewRepo qaeventusersvewRepo;
	@Autowired
    public void setQaEventUsersVewRepo (QaEventUsersVewRepo qaeventusersvewRepo) {
        this.qaeventusersvewRepo = qaeventusersvewRepo;
    }
    
 
	private QaEventParametersVewRepo qaeventparametersvewRepo;
	@Autowired
    public void setQaEventParametersVewRepo (QaEventParametersVewRepo qaeventparametersvewRepo) {
        this.qaeventparametersvewRepo = qaeventparametersvewRepo;
    }
    
 
	private QaEventsCollVewRepo qaeventscollvewRepo;
	@Autowired
    public void setQaEventsCollVewRepo (QaEventsCollVewRepo qaeventscollvewRepo) {
        this.qaeventscollvewRepo = qaeventscollvewRepo;
    }
    
 
	private QaEventsRepo qaeventsRepo;
	@Autowired
    public void setQaEventsRepo (QaEventsRepo qaeventsRepo) {
        this.qaeventsRepo = qaeventsRepo;
    }
    
 
	private QaEventStatusMastRepo qaeventstatusmastRepo;
	@Autowired
    public void setQaEventStatusMastRepo (QaEventStatusMastRepo qaeventstatusmastRepo) {
        this.qaeventstatusmastRepo = qaeventstatusmastRepo;
    }
    
 
	private QaCategoryMastRepo qacategorymastRepo;
	@Autowired
    public void setQaCategoryMastRepo (QaCategoryMastRepo qacategorymastRepo) {
        this.qacategorymastRepo = qacategorymastRepo;
    }
    
 
	private QaSubCategoryMastRepo qasubcategorymastRepo;
	@Autowired
    public void setQaSubCategoryMastRepo (QaSubCategoryMastRepo qasubcategorymastRepo) {
        this.qasubcategorymastRepo = qasubcategorymastRepo;
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
    
 
	private QaEventUserTypeMastRepo qaeventusertypemastRepo;
	@Autowired
    public void setQaEventUserTypeMastRepo (QaEventUserTypeMastRepo qaeventusertypemastRepo) {
        this.qaeventusertypemastRepo = qaeventusertypemastRepo;
    }
    
 
	private QaEventAccessTypeMastRepo qaeventaccesstypemastRepo;
	@Autowired
    public void setQaEventAccessTypeMastRepo (QaEventAccessTypeMastRepo qaeventaccesstypemastRepo) {
        this.qaeventaccesstypemastRepo = qaeventaccesstypemastRepo;
    }
    
 
	private QaEventParametersRepo qaeventparametersRepo;
	@Autowired
    public void setQaEventParametersRepo (QaEventParametersRepo qaeventparametersRepo) {
        this.qaeventparametersRepo = qaeventparametersRepo;
    }
    
 
	private QaParameterMastRepo qaparametermastRepo;
	@Autowired
    public void setQaParameterMastRepo (QaParameterMastRepo qaparametermastRepo) {
        this.qaparametermastRepo = qaparametermastRepo;
    }
    
 
	private QaParameterCategoryLinkRepo qaparametercategorylinkRepo;
	@Autowired
    public void setQaParameterCategoryLinkRepo (QaParameterCategoryLinkRepo qaparametercategorylinkRepo) {
        this.qaparametercategorylinkRepo = qaparametercategorylinkRepo;
    }
    
 
	private QaMessageTypeMastRepo qamessagetypemastRepo;
	@Autowired
    public void setQaMessageTypeMastRepo (QaMessageTypeMastRepo qamessagetypemastRepo) {
        this.qamessagetypemastRepo = qamessagetypemastRepo;
    }
    
 
	private QaEventWitnessesRepo qaeventwitnessesRepo;
	@Autowired
    public void setQaEventWitnessesRepo (QaEventWitnessesRepo qaeventwitnessesRepo) {
        this.qaeventwitnessesRepo = qaeventwitnessesRepo;
    }
    
 
	private QaEventDefaultUsersRepo qaeventdefaultusersRepo;
	@Autowired
    public void setQaEventDefaultUsersRepo (QaEventDefaultUsersRepo qaeventdefaultusersRepo) {
        this.qaeventdefaultusersRepo = qaeventdefaultusersRepo;
    }
    
 
	private QaEventLocationUsersRepo qaeventlocationusersRepo;
	@Autowired
    public void setQaEventLocationUsersRepo (QaEventLocationUsersRepo qaeventlocationusersRepo) {
        this.qaeventlocationusersRepo = qaeventlocationusersRepo;
    }
    

@Override
public List <QaEventDepartmentMast>  listQaDepartments(  )
		{return (List <QaEventDepartmentMast>) qaeventdepartmentmastRepo.findAll( );
	}
		

@Override
public List <QaEventLocationMast>  listQaLocations(  )
		{return (List <QaEventLocationMast>) qaeventlocationmastRepo.findAll( );
	}
		

@Override
public List <QaPersonalMast>  listQaPersonalMast(  )
		{return (List <QaPersonalMast>) qapersonalmastRepo.findAll( );
	}
		

@Override
public QaEventsCollVew  getQaEvent(Integer eventId )
		{return qaeventscollvewRepo.findOne(eventId );
	}
		

@Override
public List <QaCategoryMast>  listQaCategoryMast(QaCategoryMast qacategorymast )
		{return (List <QaCategoryMast>) qacategorymastRepo.findAll( );
	}
		

@Override
@Transactional
public QaCategoryMast  editQaCategoryMast(QaCategoryMast qacategorymast )	
		{			QaCategoryMast l = qacategorymastRepo.saveAndFlush(qacategorymast );
				entityManager.clear();
			return qacategorymastRepo.findOne(l.getCategoryCode() );
	}
		

@Override
@Transactional
public QaCategoryMast  createQaCategoryMast(QaCategoryMast qacategorymast )	
		{			QaCategoryMast l = qacategorymastRepo.saveAndFlush(qacategorymast );
				entityManager.clear();
			return qacategorymastRepo.findOne(l.getCategoryCode() );
	}
		

@Override
@Transactional
public Integer  deleteQaCategoryMast(Integer categoryCode )				
		{ qacategorymastRepo.delete(categoryCode ); return 0;
	}
		

@Override
@Transactional
public QaCategoryMast  getQaCategoryMast(Integer categoryCode )
		{return qacategorymastRepo.findOne(categoryCode );
	}
		

@Override
public List <QaSubCategoryMast>  listQaSubCategoryMast(QaSubCategoryMast qasubcategorymast )
		{return (List <QaSubCategoryMast>) qasubcategorymastRepo.findAll( );
	}
		

@Override
@Transactional
public QaSubCategoryMast  editQaSubCategoryMast(QaSubCategoryMast qasubcategorymast )	
		{			QaSubCategoryMast l = qasubcategorymastRepo.saveAndFlush(qasubcategorymast );
				entityManager.clear();
			return qasubcategorymastRepo.findOne(l.getSubCatCode() );
	}
		

@Override
@Transactional
public QaSubCategoryMast  createQaSubCategoryMast(QaSubCategoryMast qasubcategorymast )	
		{			QaSubCategoryMast l = qasubcategorymastRepo.saveAndFlush(qasubcategorymast );
				entityManager.clear();
			return qasubcategorymastRepo.findOne(l.getSubCatCode() );
	}
		

@Override
@Transactional
public Integer  deleteQaSubCategoryMast(Integer subCatCode )				
		{ qasubcategorymastRepo.delete(subCatCode ); return 0;
	}
		

@Override
public QaSubCategoryMast  getQaSubCategoryMast(Integer subCatCode )
		{return qasubcategorymastRepo.findOne(subCatCode );
	}
		

@Override
@Transactional
public QaEventUsers  getQaEventUser(Integer eventUserId )
		{return qaeventusersRepo.findOne(eventUserId );
	}
		

@Override
@Transactional
public List <QaEventParameters>  listQaEventParameters(QaEventParameters qaeventparameters )
		{return (List <QaEventParameters>) qaeventparametersRepo.findAll( );
	}
		

@Override
@Transactional
public QaEventParameters  createQaEventParameters(QaEventParameters qaeventparameters )	
		{			QaEventParameters l = qaeventparametersRepo.saveAndFlush(qaeventparameters );
				entityManager.clear();
			return qaeventparametersRepo.findOne(l.getEventParamId() );
	}
		

@Override
@Transactional
public QaEventParameters  editQaEventParameters(QaEventParameters qaeventparameters )	
		{			QaEventParameters l = qaeventparametersRepo.saveAndFlush(qaeventparameters );
				entityManager.clear();
			return qaeventparametersRepo.findOne(l.getEventParamId() );
	}
		

@Override
@Transactional
public Integer  deleteQaEventParameters(Integer eventParamId )				
		{ qaeventparametersRepo.delete(eventParamId ); return 0;
	}
		

@Override
@Transactional
public QaEventParameters  getQaEventParameters(Integer eventParamId )
		{return qaeventparametersRepo.findOne(eventParamId );
	}
		

@Override
@Transactional
public QaEventWitnesses  editQaEventWitnesses(QaEventWitnesses qaeventwitnesses )	
		{			QaEventWitnesses l = qaeventwitnessesRepo.saveAndFlush(qaeventwitnesses );
				entityManager.clear();
			return qaeventwitnessesRepo.findOne(l.getWitnessId() );
	}
		

@Override
@Transactional
public QaEventWitnesses  createQaEventWitnesses(QaEventWitnesses qaeventwitnesses )	
		{			QaEventWitnesses l = qaeventwitnessesRepo.saveAndFlush(qaeventwitnesses );
				entityManager.clear();
			return qaeventwitnessesRepo.findOne(l.getWitnessId() );
	}
		

@Override
@Transactional
public Integer  deleteQaEventWitnesses(Integer witnessId )				
		{ qaeventwitnessesRepo.delete(witnessId ); return 0;
	}
		

@Override
@Transactional
public List <QaEventDefaultUsers>  listQaEventDefaultUsers(QaEventDefaultUsers qaeventdefaultusers )
		{return (List <QaEventDefaultUsers>) qaeventdefaultusersRepo.findAll( );
	}
		

@Override
@Transactional
public QaEventDefaultUsers  editQaEventDefaultUsers(QaEventDefaultUsers qaeventdefaultusers )	
		{			QaEventDefaultUsers l = qaeventdefaultusersRepo.saveAndFlush(qaeventdefaultusers );
				entityManager.clear();
			return qaeventdefaultusersRepo.findOne(l.getRunId() );
	}
		

@Override
@Transactional
public QaEventDefaultUsers  createQaEventDefaultUsers(QaEventDefaultUsers qaeventdefaultusers )	
		{			QaEventDefaultUsers l = qaeventdefaultusersRepo.saveAndFlush(qaeventdefaultusers );
				entityManager.clear();
			return qaeventdefaultusersRepo.findOne(l.getRunId() );
	}
		

@Override
@Transactional
public Integer  deleteQaEventDefaultUsers(Integer runId )				
		{ qaeventdefaultusersRepo.delete(runId ); return 0;
	}
		

@Override
@Transactional
public QaEventDefaultUsers  getQaEventDefaultUsers(Integer runId )
		{return qaeventdefaultusersRepo.findOne(runId );
	}
		

@Override
@Transactional
public List <QaEventLocationUsers>  listQaEventLocationUsers(QaEventLocationUsers qaeventlocationusers )
		{return (List <QaEventLocationUsers>) qaeventlocationusersRepo.findAll( );
	}
		

@Override
@Transactional
public QaEventLocationUsers  editQaEventLocationUsers(QaEventLocationUsers qaeventlocationusers )	
		{			QaEventLocationUsers l = qaeventlocationusersRepo.saveAndFlush(qaeventlocationusers );
				entityManager.clear();
			return qaeventlocationusersRepo.findOne(l.getRunId() );
	}
		

@Override
@Transactional
public QaEventLocationUsers  createQaEventLocationUsers(QaEventLocationUsers qaeventlocationusers )	
		{			QaEventLocationUsers l = qaeventlocationusersRepo.saveAndFlush(qaeventlocationusers );
				entityManager.clear();
			return qaeventlocationusersRepo.findOne(l.getRunId() );
	}
		

@Override
@Transactional
public Integer  deleteQaEventLocationUsers(Integer runId )				
		{ qaeventlocationusersRepo.delete(runId ); return 0;
	}
		

@Override
@Transactional
public QaEventLocationUsers  getQaEventLocationUsers(Integer runId )
		{return qaeventlocationusersRepo.findOne(runId );
	}
		
 
}

  
