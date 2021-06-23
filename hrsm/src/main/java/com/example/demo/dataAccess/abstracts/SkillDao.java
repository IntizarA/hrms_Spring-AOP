package com.example.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Skills;

public interface SkillDao extends JpaRepository<Skills, Integer> {
	
	List<Skills> findAllByCandidate_Id(int id);
}
