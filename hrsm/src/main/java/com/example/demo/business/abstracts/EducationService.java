package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Education;


public interface EducationService {

	DataResult<List<Education>> getall();

	DataResult<List<Education>> findAllByCandidate_IdOrderByGraduatedYear(int id);

	DataResult<List<Education>> findAllByCandidate_Id(int id);

	Result add(Education education);

	Result update(Education education);

	Result delete(Education education);
}
