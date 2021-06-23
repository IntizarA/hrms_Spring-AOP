package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Languages;

public interface LanguageService {
	DataResult<List<Languages>> getAllByCandidate_Id(int id);

	Result add(Languages languages);

	Result update(Languages languages);

	Result delete(Languages languages);
}
