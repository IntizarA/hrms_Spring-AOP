package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.LanguageService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.LanguageDao;
import com.example.demo.entity.concretes.Languages;

@Service
public class LanguageManager implements LanguageService {
	@Autowired
	private LanguageDao languageDao;

	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Languages>> getAllByCandidate_Id(int id) {
		return new SuccessDataResult<List<Languages>>(this.languageDao.findAllByCandidate_Id(id),
				"Data found by Candidate id successfully");
	}

	@Override
	public Result add(Languages languages) {
		this.languageDao.save(languages);
		return new SuccessResult("Data listed");
	}

	@Override
	public Result update(Languages languages) {
		this.languageDao.save(languages);
		return new SuccessResult("Data updated successfully");
	}

	@Override
	public Result delete(Languages languages) {
		this.languageDao.delete(languages);
		return new SuccessResult("Data deleted successfully");
	}

}
