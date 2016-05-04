package com.odontoweb.microservice.config;

import javax.ws.rs.ApplicationPath;

import org.springframework.stereotype.Component;

import com.odontoweb.arquitetura.config.DefaultJerseyConfig;
import com.odontoweb.microservice.endpoint.Endpoint;

@Component
@ApplicationPath("sample")
public class JerseyConfig extends DefaultJerseyConfig{
	
	public JerseyConfig() {
		enableAuthorizationFilter();
		register(Endpoint.class);
	}
}
