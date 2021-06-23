package com.example.demo.entity.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private String jobDescription;

	private LocalDate createDate;

	private LocalDate deadline;

	private int openPositionCount;

}
