package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.CoverLetterService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.CoverLetterDao;
import com.example.demo.entity.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {
	@Autowired
	private CoverLetterDao coverLetterDao;

	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> findAllByCandidate_Id(int id) {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAllByCandidate_Id(id),
				"Data found by Candidate id successfully");
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Data listed");
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Data updated successfully");
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.coverLetterDao.delete(coverLetter);
		return new SuccessResult("Data deleted successfully");
	}

	@Override
	public DataResult<List<CoverLetter>> getall() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll());
	}

}
