package com.app.todoApp.model;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
public class Task{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private boolean completed;
}
