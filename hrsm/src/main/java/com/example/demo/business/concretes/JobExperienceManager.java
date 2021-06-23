package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.JobExperienceService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.JobExperienceDao;
import com.example.demo.entity.concretes.JobExperience;

@Service

public class JobExperienceManager implements JobExperienceService {
	@Autowired
	private JobExperienceDao jobExperienceDao;

	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<List<JobExperience>> findByCandidate_Id(int id) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findByCandidate_Id(id),
				"Data found by Candidate id successfully");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Data listed");
	}

	@Override
	public Result delete(JobExperience jobExperience) {
		this.jobExperienceDao.delete(jobExperience);
		return new SuccessResult("Data deleted successfully");
	}

	@Override
	public Result update(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Data updated successfully");
	}

}
