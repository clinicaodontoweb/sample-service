package com.odontoweb.microservice.endpoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.odontoweb.arquitetura.model.CustomPrincipal;
import com.odontoweb.microservice.model.Carro;
import com.odontoweb.microservice.repository.CarroRepository;

@Component
@Path("/v1")
public class Endpoint {
	
	@Autowired CarroRepository carroRepository;
	@Context SecurityContext context;

	@GET
	@Path("/lista")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Carro> listaCarros(){
		return carroRepository.findAll();
	}
	
	@GET
	@Path("/helloworld")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloworld(){
		
		return "Up and Running - Your Tenant Identifier is: "+ ((CustomPrincipal)context.getUserPrincipal()).getUser().getTenant();
	}
	
}
