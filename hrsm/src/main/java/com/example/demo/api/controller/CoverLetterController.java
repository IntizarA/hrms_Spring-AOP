package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.CoverLetterService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;

import com.example.demo.entity.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverLetter")
public class CoverLetterController {
	private CoverLetterService coverLetterService;

	@Autowired

	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}

	@GetMapping("/getall")
	public DataResult<List<CoverLetter>> getall() {
		return this.coverLetterService.getall();
	}

	@GetMapping("/getByCandidateId")
	public DataResult<List<CoverLetter>> findAllByCandidate_Id(int id) {
		return this.coverLetterService.findAllByCandidate_Id(id);
	}

	@PostMapping("/add")
	public Result add(CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
	}

	@PostMapping("/delete")
	public Result delete(CoverLetter coverLetter) {
		return this.coverLetterService.delete(coverLetter);
	}

	@PostMapping("/update")
	public Result update(CoverLetter coverLetter) {
		return this.coverLetterService.update(coverLetter);
	}

}
