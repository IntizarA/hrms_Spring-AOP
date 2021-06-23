package com.example.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
	List<JobExperience> findByCandidate_Id(int id);
}
