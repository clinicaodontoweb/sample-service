package com.odontoweb.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odontoweb.microservice.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{

}
