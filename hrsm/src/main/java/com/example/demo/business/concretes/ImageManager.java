package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;

import com.example.demo.business.abstracts.ImageService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.ImageDao;
import com.example.demo.entity.concretes.Image;

@Service
public class ImageManager implements ImageService {
	@Autowired
	private ImageDao imageDao;

	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image added successfully");
	}

	@Override
	public Result delete(Image image) {
		this.imageDao.delete(image);
		return new SuccessResult("Image deleted successfully");
	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image updated successfully");
	}

	@Override
	public DataResult<Image> getByCandidate_Id(int id) {
		return new SuccessDataResult<Image>(this.imageDao.findByCandidate_Id(id));
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
	}

}
