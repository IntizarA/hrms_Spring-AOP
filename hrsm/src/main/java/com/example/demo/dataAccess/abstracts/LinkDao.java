package com.example.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Links;

public interface LinkDao extends JpaRepository<Links, Integer> {
	
	List<Links> findAllByCandidate_Id(int id);

}
