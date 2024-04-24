package com.main.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Doctor {

	@Id
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String addr;
	@NonNull
	private Float salary;
	@NonNull
	private boolean isAdult;
	@NonNull
	private LocalDateTime dob;
	@NonNull
	private String specialization;
}
