package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.LinkService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.LinkDao;
import com.example.demo.entity.concretes.Links;

@Service
public class LinkManager implements LinkService {
	@Autowired
	private LinkDao linkDao;

	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public DataResult<List<Links>> findAllByCandidate_Id(int id) {
		return new SuccessDataResult<List<Links>>(this.linkDao.findAllByCandidate_Id(id),
				"Data found by Candidate id successfully");
	}

	@Override
	public Result add(Links link) {
		this.linkDao.save(link);
		return new SuccessResult("Data listed");
	}

	@Override
	public Result delete(Links link) {
		this.linkDao.delete(link);
		return new SuccessResult("Data deleted successfully");
	}

	@Override
	public Result update(Links link) {
		this.linkDao.save(link);
		return new SuccessResult("Data updated successfully");
	}

}
