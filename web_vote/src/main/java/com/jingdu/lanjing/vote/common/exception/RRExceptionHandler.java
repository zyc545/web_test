package com.jingdu.lanjing.vote.common.exception;

import com.jingdu.lanjing.vote.common.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 *
 *
 */
@RestControllerAdvice
public class RRExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(RRException.class)
	public R handleRRException(RRException e){
		R r = new R();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public R handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return R.error("数据库中已存在该记录");
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public R handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
		BindingResult bindingresult = e.getBindingResult();
		StringBuilder errorMessage =  new StringBuilder(bindingresult.getFieldErrors().size()*16);
		errorMessage.append("Invalid Request:");
		for(int i=0;i<bindingresult.getFieldErrors().size();i++){
			if(i>0){
				errorMessage.append(",");
			}
			FieldError fielderror = bindingresult.getFieldErrors().get(i);
			errorMessage.append(fielderror.getField());
			errorMessage.append(":");
			errorMessage.append(fielderror.getDefaultMessage());
		}
		logger.error(e.getMessage(), e);
		return R.error(100,errorMessage.toString());
	}
	@ExceptionHandler(Exception.class)
	public R handleException(Exception e){
		logger.error(e.getMessage(), e);
		return R.error();
	}


}
