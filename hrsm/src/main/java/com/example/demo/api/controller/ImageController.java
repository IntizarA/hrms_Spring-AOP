package com.example.demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.ImageService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Image;

@RestController
@RequestMapping("/api/imagecontroller")
public class ImageController {
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	@PostMapping("/add")
	public Result add(Image image) {
		return this.imageService.add(image);
	}

	@PostMapping("/delete")
	public Result delete(Image image) {
		return this.imageService.delete(image);
	}

	@PostMapping("/update")
	public Result update(Image image) {
		return this.imageService.update(image);
	}

	@PostMapping("/getByCandidateId")
	public DataResult<Image> findByCandidate_Id(int id) {
		return this.imageService.getByCandidate_Id(id);
	}
	@GetMapping("/getall")
	public DataResult<List<Image>> getall(){
		return this.imageService.getAll();
	}

}
