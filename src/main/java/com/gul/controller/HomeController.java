package com.gul.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@GetMapping("/video")
	public ResponseEntity<byte[]> getImageAsResponseEntity() throws IOException {
	    HttpHeaders headers = new HttpHeaders();
	    byte[] media = FileUtils.readFileToByteArray(new File("C:/Users/gulfa/Downloads/Video/Inside Assam’s Detention Camp- 'Its Like Hell' (BBC Hindi).mp4"));
	    ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(media, headers, HttpStatus.OK);
	    return responseEntity;
	}
}
