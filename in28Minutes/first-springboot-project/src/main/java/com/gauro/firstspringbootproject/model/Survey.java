package com.gauro.firstspringbootproject.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Survey {
	private String id;
	private String title;
	private String description;
	private List<Question> questions;

}
