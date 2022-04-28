package com.app.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Request;
import com.app.dto.Response;

@RestController
@RequestMapping
public class Example_one {
	//"data": [“A”,”1”,”334”,”4”,”R”]
	@PostMapping("/example1")
	public Response example1(@RequestBody Request req) {
		Response response=new Response();
		System.out.println(Arrays.toString(req.getAlphabets()));
		//
		int place=0,place2=0;
		String[] obj=req.getAlphabets();
		String[]  alphabets=new String[obj.length];
		int[] num=new int[obj.length];
		
		for(int i=0;i<obj.length;i++) {
			if(Character.isLetter(obj[i].charAt(0))) {	
				alphabets[place++]=obj[i];
			}else {
				num[place2++]=Integer.parseInt(obj[i]);
			}
		}
		
		response.set_success(true);
		response.setAlphabets(alphabets);
		response.setNumbers(num);
		response.setEmail("utkarsh.s4000@gmail.com");
		response.setRoll_number("PD0094");
		response.setUser_id("utkarsh_sapate_210941220215");

		return response;
	}

}
