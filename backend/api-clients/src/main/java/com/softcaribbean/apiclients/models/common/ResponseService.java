package com.softcaribbean.apiclients.models.common;

import org.springframework.stereotype.Component;

@Component
public class ResponseService {

	private String tipoRespuesta;
	private ResponseError responseError;
	private Object response;

	public String getTipoRespuesta() {
		return tipoRespuesta;
	}

	public void setTipoRespuesta(String tipoRespuesta) {
		this.tipoRespuesta = tipoRespuesta;
	}

	public ResponseError getResponseError() {
		return responseError;
	}

	public void setResponseError(ResponseError responseError) {
		this.responseError = responseError;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
	

}
