package com.mydating.dating.entity;

import java.util.List;

import com.mydating.dating.utility.UserGender;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private int age;
	private UserGender gender;
	@ElementCollection
	private List<String> intrests;
	
}
