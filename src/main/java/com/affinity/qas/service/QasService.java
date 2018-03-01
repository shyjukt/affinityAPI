package com.affinity.qas.service; 

		
 
import java.util.List;
import com.affinity.qas.domain.QaPersonalMast;
import com.affinity.qas.domain.QaEventUsers;
import com.affinity.qas.domain.QaEventDefaultUsers;
import com.affinity.qas.domain.QaEventLocationUsers;
import com.affinity.qas.domain.QaEventWitnessesVew;
import com.affinity.qas.domain.QaEventDepartmentMast;
import com.affinity.qas.domain.QaEventMessagesVew;
import com.affinity.qas.domain.QaEventWitnesses;
import com.affinity.qas.domain.QaEventUsersVew;
import com.affinity.qas.domain.QaSubCategoryMast;
import com.affinity.qas.domain.QaEventsCollVew;
import com.affinity.qas.domain.QaEventParameters;
import com.affinity.qas.domain.QaEventLocationMast;
import com.affinity.qas.domain.QaCategoryMast;
import com.affinity.qas.model.QaEventSearchCriteria;
 
public interface QasService  {
QaEventLocationUsers  getQaEventLocationUsers(Integer runId );
QaEventDefaultUsers  getQaEventDefaultUsers(Integer runId );
QaEventParameters  getQaEventParameters(Integer eventParamId );
QaEventUsers  getQaEventUser(Integer eventUserId );
QaSubCategoryMast  getQaSubCategoryMast(Integer subCatCode );
QaCategoryMast  getQaCategoryMast(Integer categoryCode );
Integer  deleteQaEventLocationUsers(Integer runId );
Integer  deleteQaEventDefaultUsers(Integer runId );
Integer  deleteQaEventWitnesses(Integer witnessId );
Integer  deleteQaEventParameters(Integer eventParamId );
Integer  deleteQaCategoryMast(Integer categoryCode );
Integer  deleteQaSubCategoryMast(Integer subCatCode );
QaEventsCollVew  getQaEvent(Integer eventId );
QaCategoryMast  createQaCategoryMast(QaCategoryMast qacategorymast );
QaCategoryMast  editQaCategoryMast(QaCategoryMast qacategorymast );
List <QaCategoryMast>  listQaCategoryMast(QaCategoryMast qacategorymast );
QaSubCategoryMast  createQaSubCategoryMast(QaSubCategoryMast qasubcategorymast );
QaSubCategoryMast  editQaSubCategoryMast(QaSubCategoryMast qasubcategorymast );
List <QaSubCategoryMast>  listQaSubCategoryMast(QaSubCategoryMast qasubcategorymast );
QaEventParameters  editQaEventParameters(QaEventParameters qaeventparameters );
QaEventParameters  createQaEventParameters(QaEventParameters qaeventparameters );
List <QaEventParameters>  listQaEventParameters(QaEventParameters qaeventparameters );
QaEventWitnesses  createQaEventWitnesses(QaEventWitnesses qaeventwitnesses );
QaEventWitnesses  editQaEventWitnesses(QaEventWitnesses qaeventwitnesses );
QaEventDefaultUsers  createQaEventDefaultUsers(QaEventDefaultUsers qaeventdefaultusers );
QaEventDefaultUsers  editQaEventDefaultUsers(QaEventDefaultUsers qaeventdefaultusers );
List <QaEventDefaultUsers>  listQaEventDefaultUsers(QaEventDefaultUsers qaeventdefaultusers );
QaEventLocationUsers  createQaEventLocationUsers(QaEventLocationUsers qaeventlocationusers );
QaEventLocationUsers  editQaEventLocationUsers(QaEventLocationUsers qaeventlocationusers );
List <QaEventLocationUsers>  listQaEventLocationUsers(QaEventLocationUsers qaeventlocationusers );
List <QaPersonalMast>  listQaPersonalMast(  );
List <QaEventLocationMast>  listQaLocations(  );
List <QaEventDepartmentMast>  listQaDepartments(  );
 
}

  
