package com.mydating.dating.dto;

import java.util.List;

import com.mydating.dating.utility.UserGender;

import jakarta.persistence.ElementCollection;
import lombok.Data;

@Data
public class MatchingUser {
	private int id;
	private String name;
	private String email;
	private long phone;
	private int age;
	private UserGender gender;
	@ElementCollection
	private List<String> intrests;
	private int ageDiff;
//	mic matching intrest count
	private int mic;
}
