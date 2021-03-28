package com.softcaribbean.apiclients.models.repository;

import com.softcaribbean.apiclients.models.entity.Client;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{}
