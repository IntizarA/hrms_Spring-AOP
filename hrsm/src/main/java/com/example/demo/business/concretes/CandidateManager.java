package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.CandidateService;
import com.example.demo.business.abstracts.CoverLetterService;
import com.example.demo.business.abstracts.EducationService;
import com.example.demo.business.abstracts.ImageService;
import com.example.demo.business.abstracts.JobExperienceService;
import com.example.demo.business.abstracts.LanguageService;
import com.example.demo.business.abstracts.LinkService;
import com.example.demo.business.abstracts.SkillService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.ErrorResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.CandidateDao;
import com.example.demo.entity.concretes.Candidate;
import com.example.demo.entity.concretes.User;
import com.example.demo.entity.dtos.CandidateCvDto;

@Service
public class CandidateManager implements CandidateService {
	private CandidateDao candidateDao;
	private EducationService educationService;
	private SkillService skillService;
	private JobExperienceService jobExperience;
	private LanguageService languageService;
	private ImageService imageService;
	private LinkService linkService;
	private CoverLetterService coverLetterService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, EducationService educationService, SkillService skillService,
			JobExperienceService jobExperience, LanguageService languageService, ImageService imageService,
			LinkService linkService, CoverLetterService coverLetterService) {
		super();
		this.candidateDao = candidateDao;
		this.educationService = educationService;
		this.skillService = skillService;
		this.jobExperience = jobExperience;
		this.languageService = languageService;
		this.imageService = imageService;
		this.linkService = linkService;
		this.coverLetterService = coverLetterService;
	}

	@Override
	public DataResult<List<Candidate>> getall() {

		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Candidate's data listed");
	}

	@Override
	public Result add(Candidate candidate) {

		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate's data added");
	}

	@Override
	public Result checkEmail(String email) {
		//Candidate candidate = new Candidate();
		if (isSuccessCode(email)) {
			return new SuccessResult("Never used before");

		} else
			return new ErrorResult("Used Before");
	}

	public boolean isSuccessCode(String email) {
		User user = new User();
		boolean isFirtTimeOfEmail = true;
		for (Candidate checkEmail : this.candidateDao.findAll()) {
			if (checkEmail.getUser().getEmail().equals(email)) {
				this.candidateDao.update(email, user.getId());
				isFirtTimeOfEmail = false;
			}
		}
		return isFirtTimeOfEmail;

	}

	@Override
	public DataResult<CandidateCvDto> getDtoById(int id) {
		CandidateCvDto candidateCvDto = new CandidateCvDto();
		candidateCvDto.education = this.educationService.findAllByCandidate_Id(id).getData();
		candidateCvDto.skills = this.skillService.findAllByCandidate_Id(id).getData();
		candidateCvDto.jobExperience = this.jobExperience.findByCandidate_Id(id).getData();
		candidateCvDto.languages = this.languageService.getAllByCandidate_Id(id).getData();
		candidateCvDto.image = this.imageService.getByCandidate_Id(id).getData();
		candidateCvDto.links = this.linkService.findAllByCandidate_Id(id).getData();
		candidateCvDto.coverLetter = this.coverLetterService.findAllByCandidate_Id(id).getData();
		return new SuccessDataResult<CandidateCvDto>(candidateCvDto);

	}

}
