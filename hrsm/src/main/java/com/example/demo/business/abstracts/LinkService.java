package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Links;

public interface LinkService {
	DataResult<List<Links>> findAllByCandidate_Id(int id);

	Result add(Links link);

	Result delete(Links link);

	Result update(Links link);
}
