package com.learning.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.CandidateDetails;
import com.learning.service.CandiateService;

@RestController
@RequestMapping("/api")
public class CandidateController {

	@Autowired
	CandiateService candiateService;
	
	@PostMapping("/save")
	public CandidateDetails saveCandidate(@RequestBody CandidateDetails candidateDetails) {
		return candiateService.saveCandidate(candidateDetails);		
	}
	
	@GetMapping("/getDetails")
	public List<CandidateDetails> getAllCandidateDetails() {
		return candiateService.getAllCandidateDetails();
	}
	
	@GetMapping("/getCandidateDetailsById/{id}")
	public CandidateDetails getByIdCandidateDetails(@PathVariable int id) {
		return candiateService.getByIdCandidateDetails(id);
	}
	
	@GetMapping("/getCandidateDetailsByAddress/{address}")
	public CandidateDetails getByAddressCandidateDetails(@PathVariable String address) {
		return candiateService.getByAddressCandidateDetails(address);
	}
	
	@PutMapping("/updateCandidateDetails")
	public CandidateDetails updateCandidateDetails(@RequestBody CandidateDetails candidateDetails) {
		return candiateService.updateCandidateDetails(candidateDetails);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCandidateDetails(@PathVariable int id) {
		candiateService.deleteCandidateDetails(id);;
		return "Deleted";
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllCandidateDetails() {
		candiateService.deleteAllCandidateDetails();;
		return "All Deleted";
	}
}
