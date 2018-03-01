package com.affinity.qas.service;

import java.util.List;

import com.affinity.qas.domain.QaEventMessages;
import com.affinity.qas.domain.QaEventMessagesVew;
import com.affinity.qas.domain.QaEventUsers;
import com.affinity.qas.domain.QaEventUsersVew;
import com.affinity.qas.domain.QaEventWitnessesVew;
import com.affinity.qas.domain.QaEvents;
import com.affinity.qas.domain.QaEventsColl;
import com.affinity.qas.domain.QaEventsCollVew;
import com.affinity.qas.model.QaEventSearchCriteria;

public interface QasServiceExt {

	public QaEventsCollVew  createQaEvent(QaEventsColl qaeventscoll );
	public List <QaEventsCollVew>  listQaEvents(QaEventSearchCriteria qaeventsearchcriteria );
	public List <QaEventUsersVew>  listQaEventUsersVew(Integer eventId );

	QaEventMessagesVew  createQaEventComment(QaEventMessages qaeventmessages );
	QaEventMessagesVew  createQaEventConsequences(QaEventMessages qaeventmessages );
	QaEventMessagesVew  createQaEventAction(QaEventMessages qaeventmessages );
	QaEventMessagesVew  createQaEventRecommendation(QaEventMessages qaeventmessages );

	QaEventUsersVew  	createQaEventUser(QaEventUsers qaeventusers );
	QaEventUsersVew  	editQaEventUser(QaEventUsers qaEventUsers );
	Integer  			deleteQaEventUser(Integer eventUserId );
	
 	QaEventMessagesVew  editQaEventDescription(QaEventMessages qaeventmessages );

	QaEventMessagesVew  editQaEventComment(QaEventMessages qaeventmessages );
	QaEventMessagesVew  editQaEventConsequences(QaEventMessages qaeventmessages );
	QaEventMessagesVew  editQaEventAction(QaEventMessages qaeventmessages );
	QaEventMessagesVew  editQaEventRecommendation(QaEventMessages qaeventmessages );
		
	public QaEventsCollVew  approveQaEvent(Integer eventId );
	public QaEventsCollVew  cancelEventApproval(Integer eventId );
	public QaEventsCollVew  reOpenQaEvent(Integer eventId );
	public QaEventsCollVew  closeQaEvent(Integer eventId );
	public QaEventsCollVew  cancelQaEvent(Integer eventId );
	public QaEventWitnessesVew  getQaEventWitnesses(Integer witnessId );
	public List <QaEventWitnessesVew>  listQaEventWitnesses( Integer witnessId );
	
	public QaEventsCollVew  editQaEventHdr(QaEvents qaevents )	;
}