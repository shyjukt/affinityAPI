package com.affinity.awas.support;

import java.util.Collection;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.affinity.awas.constants.CodeEnum;
import com.affinity.awas.constants.OperationConstants;

@Component
public class ResultMappingHandler {
	@Autowired
	private MessageSource messageSource;
	
	public ResultMappingHandler() {

	}

	public ResultMapping resolveResult(Object result, String operation) {
		ResultMapping res = resolveResult(result, operation, null);
		return res;
	}

	public ResultMapping resolveResult(Object result) {
		ResultMapping res = resolveResult(result, null, null);
		return res;
	}

	public ResultMapping resolveResult(Object result, String operation, String messageCode) {
		ResultMapping decorator = new ResultMapping();
		decorator = getResultDecorator(result, operation, messageCode);
		return decorator;
	}

//	@SuppressWarnings("unused")
	private ResultMapping getResultDecorator(Object result, String operation, String messageCode) {
		ResultMapping decorator = new ResultMapping();
		decorator.setResult(result);
		if (result instanceof Boolean) {
			decorator.setCode(Long.valueOf(CodeEnum.IDEAL_CODE.getLongValue()));
			boolean boolResult = Boolean.valueOf(result.toString());
			if (operation.equals(OperationConstants.SAVE)) {
				if (boolResult) {
					decorator.setCode(CodeEnum.IDEAL_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.SUCCESSFUL_SAVE.getValue(), null, Locale.ENGLISH));
				} else {
					decorator.setCode(CodeEnum.FAILURE_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.UNSUCCESSFUL_SAVE.getValue(), null, Locale.ENGLISH));
				}
			} else if (operation.equals(OperationConstants.UPDATE)) {
				if (boolResult) {
					decorator.setCode(CodeEnum.IDEAL_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.SUCCESSFUL_UPDATE.getValue(), null, Locale.ENGLISH));
				} else {
					decorator.setCode(CodeEnum.FAILURE_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.UNSUCCESSFUL_UPDATE.getValue(), null, Locale.ENGLISH));
				}
			} else if (operation.equals(OperationConstants.DELETE)) {
				if (boolResult) {
					decorator.setMessage(messageSource.getMessage(CodeEnum.SUCCESSFUL_DELETE.getValue(), null, Locale.ENGLISH));
				} else {
					decorator.setMessage(messageSource.getMessage(CodeEnum.UNSUCCESSFUL_DELETE.getValue(), null, Locale.ENGLISH));
				}
			} else if (operation.equals(OperationConstants.OTHER)) {
				// TODO: Handle Others
			}

			return decorator;

		}else if(result instanceof Long){ //added by it-samsudeen
			decorator.setCode(Long.valueOf(CodeEnum.IDEAL_CODE.getLongValue()));
			Long longResult = Long.valueOf(result.toString());
			if (operation.equals(OperationConstants.SAVE)) {
				if (longResult != null) {
					decorator.setCode(CodeEnum.IDEAL_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.SUCCESSFUL_SAVE.getValue(), null, Locale.ENGLISH));
				} else {
					decorator.setCode(CodeEnum.FAILURE_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.UNSUCCESSFUL_SAVE.getValue(), null, Locale.ENGLISH));
				}
			} 
		}

		if (operation != null && operation.equals(OperationConstants.SEARCH)) {
			if (result instanceof Collection) {
				List list = (List) result;
				if (list != null && list.size() > 0) {
					decorator.setCode(CodeEnum.IDEAL_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.GENERIC_TOT_REC_FOUND.getValue(), new Object[]{Long.valueOf(list.size())}, Locale.ENGLISH));
				}else if(list != null && list.size() == 0){
					decorator.setCode(CodeEnum.NO_RECORD_CODE.getLongValue());
					decorator.setMessage(messageSource.getMessage(CodeEnum.GENERIC_NO_REC_FOUND.getValue(), null, Locale.ENGLISH));
				}
			}
			else if (result == null) {
				decorator.setCode(CodeEnum.NO_RECORD_CODE.getLongValue());
				decorator.setMessage(messageSource.getMessage(CodeEnum.GENERIC_NO_REC_FOUND.getValue(), null, Locale.ENGLISH));
			}
			else {
				decorator.setCode(CodeEnum.IDEAL_CODE.getLongValue());
				decorator.setMessage(messageSource.getMessage(CodeEnum.GENERIC_TOT_REC_FOUND.getValue(), new Object[]{1}, Locale.ENGLISH));
			}
		}
		if (messageCode != null) {
			decorator.setMessage(messageCode);
		}
		return decorator;

	}

}
