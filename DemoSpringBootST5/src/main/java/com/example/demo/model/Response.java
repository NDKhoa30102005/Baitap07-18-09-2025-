package com.example.demo.model;

import java.util.List;

import com.example.demo.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	private Boolean status;
	private String message;
	private Object body;
	public Response(Boolean status, String message, Object body) {
		super();
		this.status = status;
		this.message = message;
		this.body = body;
	}
	
}