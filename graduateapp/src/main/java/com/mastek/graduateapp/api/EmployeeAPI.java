package com.mastek.graduateapp.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.graduateapp.entities.Employee;


@Path("/employee/")
public interface EmployeeAPI {
	
	@GET
	@Path("/employee/list/")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the methods support - one you write first is default
	public Iterable<Employee> listAllaccounts();
	
	
	@GET
	@Path("/employee/find/{username}/{password}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Employee> findByUsernameAndPassword(@PathParam("username") String username, @PathParam("password") String password);
	
	
	@POST // http method post to to send data in requests
	@Path("/employee/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee registerNewAccount(@BeanParam Employee newEmployee);

}
