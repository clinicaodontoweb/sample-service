package com.odontoweb.microservice.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import com.odontoweb.arquitetura.model.CustomPrincipal;

@Component
@Path("/v1")
public class Endpoint {
	
	@Context SecurityContext context;

	@GET
	@Path("/helloworld")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloworld(){
		
		return "Up and Running - Your Tenant Identifier is: "+ ((CustomPrincipal)context.getUserPrincipal()).getUser().getTenant();
	}
	
}
