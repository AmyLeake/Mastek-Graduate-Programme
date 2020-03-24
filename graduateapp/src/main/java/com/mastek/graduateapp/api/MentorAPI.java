package com.mastek.graduateapp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.graduateapp.entities.Mentor;

@Path("/mentor/")
public interface MentorAPI {
	
	@GET
	@Path("find/{designation}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Mentor> findMentorByDesignation(Designtion designation);
	

}
