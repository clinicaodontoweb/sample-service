package com.odontoweb.microservice.exception;

public class UsuarioNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public UsuarioNotFoundException() {
		super("Usu�rio ou Senha n�o conferem.");
	}
}
