package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.EducationService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Education;

@RestController
@CrossOrigin
@RequestMapping("/api/educationcontroller")
public class EducationController {
	private EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Education>> findAll() {
		return this.educationService.getall();
	}

	@GetMapping("/getAllByCandidate_IdOrderByGraduatedYear")
	public DataResult<List<Education>> findAllByCandidate_IdOrderByGraduatedYear(int id) {
		return this.educationService.findAllByCandidate_IdOrderByGraduatedYear(id);
	}

	@GetMapping("/getAllByCandidate_Id")
	public DataResult<List<Education>> findAllByCandidate_Id(int id) {
		return this.educationService.findAllByCandidate_Id(id);
	}

	@PostMapping("/add")
	public Result add(Education education) {
		return this.educationService.add(education);
	}

	@PostMapping("/delete")
	public Result delete(Education education) {
		return this.educationService.delete(education);
	}

	@PostMapping("/update")
	public Result update(Education education) {
		return this.educationService.update(education);
	}

	
}
