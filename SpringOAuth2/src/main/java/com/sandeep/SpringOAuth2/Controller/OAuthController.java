package com.sandeep.SpringOAuth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

	@GetMapping("/")
	public String getRequest() {
		
		return "Hello OAuth";
	}
}
