package com.example.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.concretes.Languages;

public interface LanguageDao extends JpaRepository<Languages, Integer> {
	List<Languages> findAllByCandidate_Id(int id);

}
