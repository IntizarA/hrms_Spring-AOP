package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Skills;

public interface SkillService {
	DataResult<List<Skills>> findAllByCandidate_Id(int id);
	DataResult<List<Skills>> getall();
	Result add(Skills skill);
	Result update(Skills skill);
	Result delete(Skills skill);
}
