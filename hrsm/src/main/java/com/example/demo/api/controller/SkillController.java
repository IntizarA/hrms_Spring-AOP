package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.SkillService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;

import com.example.demo.entity.concretes.Skills;

@RestController
@RequestMapping("/api/skills")
public class SkillController {
	private SkillService skillService;

	@Autowired
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}

	@GetMapping("/findAllByCandidateId")
	public DataResult<List<Skills>> findAllByCandidate_Id(int id) {
		return this.skillService.findAllByCandidate_Id(id);
	}

	@PostMapping("/add")
	public Result add(Skills skills) {
		return this.skillService.add(skills);
	}

	@PostMapping("/delete")
	public Result delete(Skills skills) {
		return this.skillService.delete(skills);
	}

	@PostMapping("/update")
	public Result update(Skills skills) {
		return this.skillService.update(skills);
	}

	@GetMapping("/getall")
	public DataResult<List<Skills>> getall() {
		return this.skillService.getall();
	}
}
