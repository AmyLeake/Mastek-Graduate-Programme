package com.mastek.graduateapp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.graduateapp.entities.Designation;
import com.mastek.graduateapp.entities.Languages;
import com.mastek.graduateapp.entities.Mentor;

@Path("/graduate/")
public interface MentorAPI {
	
	@GET
	@Path("/mentor/find/{designation}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Mentor> findMentorByDesignation(@PathParam("designation") Designation designation);
	
	@GET
	@Path("/mentor/findlan/{mainLanguage}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Mentor> findMentorByLanguage(@PathParam("mainLanguage") Languages mainLanguage);
	
	

}
