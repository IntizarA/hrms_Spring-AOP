package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.LanguageService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Languages;

@RestController
@RequestMapping("/api/languagecontroller")
public class LanguageController {
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getByCandidateId")
	public DataResult<List<Languages>> findByCandidate_Id(int id) {
		return this.languageService.getAllByCandidate_Id(id);
	}

	@PostMapping("/add")
	public Result add(Languages languages) {
		return this.languageService.add(languages);
	}

	@PostMapping("/delete")
	public Result delete(Languages languages) {
		return this.languageService.delete(languages);
	}

	@PostMapping("/update")
	public Result update(Languages languages) {
		return this.languageService.update(languages);
	}

}
