package com.juan.backend.userapp.backenduserapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.juan.backend.userapp.backenduserapp.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
}
