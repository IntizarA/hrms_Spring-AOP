package com.example.demo.entity.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationCandidate {
	private String email;
	private String password;
	private String confirmPassword;
	private String firstName;
	private String lastName;
	private String identificationNumber;
	private LocalDate dateOfBirth;
}
