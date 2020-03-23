package com.mastek.graduateapp.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.graduateapp.services.GraduateService;

@Component
public class APIConfig extends ResourceConfig{
	
	public APIConfig() {
		register(CORSFilter.class);
		register(GraduateService.class);
	}

}
