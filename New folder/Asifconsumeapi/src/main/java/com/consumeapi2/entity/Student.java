package com.consumeapi2.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class Student {
	@NonNull
	private int id;
	private String name;
	private String city;

}
