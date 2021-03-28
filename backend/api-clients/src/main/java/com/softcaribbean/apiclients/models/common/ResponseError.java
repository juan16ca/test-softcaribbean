package com.softcaribbean.apiclients.models.common;

import org.springframework.stereotype.Component;

@Component
public class ResponseError {

	private int codeError;
	private String detailError;
	private String typeError;
	private String systemError;

	public int getCodeError() {
		return codeError;
	}

	public void setCodeError(int codeError) {
		this.codeError = codeError;
	}

	public String getDetailError() {
		return detailError;
	}

	public void setDetailError(String detailError) {
		this.detailError = detailError;
	}

	public String getTypeError() {
		return typeError;
	}

	public void setTypeError(String typeError) {
		this.typeError = typeError;
	}

	public String getSystemError() {
		return systemError;
	}

	public void setSystemError(String systemError) {
		this.systemError = systemError;
	}

}
