package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.model.CandidateDetails;
import com.learning.repository.CandidateRepository;

@Service
public class CandiateService {

	@Autowired
	CandidateRepository candidateRepository;
	
	public CandidateDetails saveCandidate(@RequestBody CandidateDetails candidateDetails) {
		return candidateRepository.save(candidateDetails);
	}
	
	public List<CandidateDetails> getAllCandidateDetails() {
		return (List<CandidateDetails>) candidateRepository.findAll();
	}

	public CandidateDetails getByIdCandidateDetails(int id) {
		return candidateRepository.findById(id);
	}

	public CandidateDetails getByAddressCandidateDetails(String address) {
		return candidateRepository.findByAddress(address);
	}

	public CandidateDetails updateCandidateDetails(CandidateDetails candidateDetails) {
		return candidateRepository.save(candidateDetails);
	}

	public void deleteCandidateDetails(int id) {
		candidateRepository.deleteById(id);	
	}

	public void deleteAllCandidateDetails() {
		candidateRepository.deleteAll();
	}
	
}
