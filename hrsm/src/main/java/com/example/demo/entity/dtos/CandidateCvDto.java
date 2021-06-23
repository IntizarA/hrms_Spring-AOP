package com.example.demo.entity.dtos;

import java.util.List;



import com.example.demo.entity.concretes.Candidate;
import com.example.demo.entity.concretes.CoverLetter;
import com.example.demo.entity.concretes.Education;
import com.example.demo.entity.concretes.Image;
import com.example.demo.entity.concretes.JobExperience;
import com.example.demo.entity.concretes.Languages;
import com.example.demo.entity.concretes.Links;
import com.example.demo.entity.concretes.Skills;

public class CandidateCvDto {
	public Candidate candidate;
	
	public List<Skills> skills;
	
	public List<Education> education;
	
	public List<Languages> languages;
	
	public List<Links> links;
	
	public List<JobExperience> jobExperience;
	
	public List<CoverLetter> coverLetter;
	
	public Image image;
}
