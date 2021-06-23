package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.JobExperienceService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperiencecontroller")
public class JobExperienceController {

	private JobExperienceService jobExperienceService;

	@Autowired

	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}

	@GetMapping("/getByCandidateId")
	public DataResult<List<JobExperience>> findByCandidate_Id(int id) {
		return this.jobExperienceService.findByCandidate_Id(id);
	}

	@PostMapping("/add")
	public Result add(JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}

	@PostMapping("/delete")
	public Result delete(JobExperience jobExperience) {
		return this.jobExperienceService.delete(jobExperience);
	}

	@PostMapping("/update")
	public Result update(JobExperience jobExperience) {
		return this.jobExperienceService.update(jobExperience);
	}

}
