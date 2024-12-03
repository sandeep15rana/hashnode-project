package com.sandeep.SpringOAuth2.Config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configurable
@EnableWebSecurity
public class SecurityConfig {
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		http.oauth2Client(Customizer.withDefaults());
		
		return http.build();
	}

}
