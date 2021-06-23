package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.LinkService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Links;

@RestController
@RequestMapping("/api/linkcontroller")
public class LinkController {
	private LinkService linkService;

	@Autowired
	public LinkController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}

	@GetMapping("/getByCandidateId")
	public DataResult<List<Links>> findAllByCandidate_Id(int id) {
		return this.linkService.findAllByCandidate_Id(id);
	}

	@PostMapping("/add")
	public Result add(Links link) {
		return this.linkService.add(link);
	}

	@PostMapping("/delete")
	public Result delete(Links link) {
		return this.linkService.delete(link);
	}

	@PostMapping("/update")
	public Result update(Links link) {
		return this.linkService.update(link);
	}

}
