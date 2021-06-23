package com.example.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {

	List<Education> findAllByCandidate_IdOrderByGraduatedYear(int id);

	List<Education> findAllByCandidate_Id(int id);

}
