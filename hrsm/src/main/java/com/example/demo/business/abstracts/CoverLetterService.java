package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;

import com.example.demo.core.utilities.results.Result;

import com.example.demo.entity.concretes.CoverLetter;

public interface CoverLetterService {
	DataResult<List<CoverLetter>> getall();

	DataResult<List<CoverLetter>> findAllByCandidate_Id(int id);

	Result add(CoverLetter coverLetter);

	Result update(CoverLetter coverLetter);

	Result delete(CoverLetter coverLetter);
}
