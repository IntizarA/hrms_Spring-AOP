package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.JobExperience;

public interface JobExperienceService {
	DataResult<List<JobExperience>> findByCandidate_Id(int id);

	Result add(JobExperience jobExperience);

	Result delete(JobExperience jobExperience);

	Result update(JobExperience jobExperience);
}
