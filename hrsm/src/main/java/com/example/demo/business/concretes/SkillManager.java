package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.SkillService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.SkillDao;
import com.example.demo.entity.concretes.Skills;

@Service
public class SkillManager implements SkillService {
	@Autowired
	private SkillDao skillDao;

	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<Skills>> findAllByCandidate_Id(int id) {
		return new SuccessDataResult<List<Skills>>(this.skillDao.findAllByCandidate_Id(id),
				"Data found by Candidate id successfull");
	}

	@Override
	public Result add(Skills skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Data listed");
	}

	@Override
	public Result update(Skills skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Data updated successfully");
	}

	@Override
	public Result delete(Skills skill) {
		this.skillDao.delete(skill);
		return new SuccessResult("Data deleted successfully");
	}

	@Override
	public DataResult<List<Skills>> getall() {
		return new SuccessDataResult<List<Skills>>(this.skillDao.findAll());
	}

}
