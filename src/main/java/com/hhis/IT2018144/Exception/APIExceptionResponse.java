package com.hhis.IT2018144.Exception;

import org.springframework.http.HttpStatus;

public class APIExceptionResponse {

	private Integer status;
	private Object data;
	private Object error;

	public APIExceptionResponse() {
		super();
	}

	public APIExceptionResponse(Integer status, Object data, Object error) {
		super();
		this.status = HttpStatus.OK.value();
		this.data = data;
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

}
