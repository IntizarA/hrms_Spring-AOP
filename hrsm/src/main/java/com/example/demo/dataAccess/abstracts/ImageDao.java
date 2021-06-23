package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {
	Image findByCandidate_Id(int id);

	Image findById(int id);
}
