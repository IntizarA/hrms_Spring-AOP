package com.example.demo.business.abstracts;
//import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.Image;

public interface ImageService {
	
	DataResult<List<Image>> getAll();
	DataResult<Image> getByCandidate_Id(int id);

	Result add(Image image);

	// Faylın məzmunu yaddaşda və ya müvəqqəti olaraq diskdə saxlanılır. Hər iki
	// halda da
	// istifadəçi fayl məzmununun tələb olunduğu və sessiya səviyyəsinə və ya
	// davamlı yaddaşa köçürülməsindən məsuldur.
	// Sorğu işləndikdən sonra müvəqqəti saxlama silinəcəkdir.
	Result delete(Image image);

	Result update(Image image);
}
