package com.learning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.model.CandidateDetails;

@Repository
public interface CandidateRepository extends CrudRepository<CandidateDetails, Integer>{
	
	CandidateDetails findById(int id);
	
	CandidateDetails findByAddress(String address);
}
