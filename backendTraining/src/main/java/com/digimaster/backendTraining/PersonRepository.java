package com.digimaster.backendTraining;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonModel, Integer> {
	
	PersonModel getPersonModelByUserEmail(String userEmail);
	
	@Query("select u.userEmail from PersonModel u")
	java.util.List<Object> getEmail();

}
