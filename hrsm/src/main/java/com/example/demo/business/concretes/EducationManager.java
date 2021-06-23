package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.EducationService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.EducationDao;
import com.example.demo.entity.concretes.Education;

@Service
public class EducationManager implements EducationService {
	@Autowired
	private EducationDao educationDao;

	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> findAllByCandidate_IdOrderByGraduatedYear(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAllByCandidate_IdOrderByGraduatedYear(id),
				"Found Successfully");
	}

	@Override
	public DataResult<List<Education>> findAllByCandidate_Id(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAllByCandidate_Id(id),
				"Found successfully by Candidate id");
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Data listed");
	}

	@Override
	public Result update(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Data updated");
	}

	@Override
	public Result delete(Education education) {
		this.educationDao.delete(education);
		return new SuccessResult("Data deleted successfully");
	}

	@Override
	public DataResult<List<Education>> getall() {

		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"success");
	}

}
