package br.com.crud.generico.exception;

public class AppServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public AppServiceException(String msg) {
		super(msg);
	}

	public AppServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
