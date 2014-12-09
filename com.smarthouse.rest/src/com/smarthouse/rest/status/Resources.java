package com.smarthouse.rest.status;

import java.io.IOException;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@Path("/")
public class Resources {

	@GET
	@Path("JSONTest")
	@Produces(MediaType.APPLICATION_JSON)
	// try with TEXT_HTML. See if still works.
	public String returnJSON() throws JsonGenerationException,
			JsonMappingException, IOException {

		SmartHouse instance = new SmartHouse();
		String jsonString = null;

		// this lets us try modify the address
		// instance.setAddress("321 Real St, Realville");
		ObjectMapper mapper = new ObjectMapper();// thing that makes json

		jsonString = mapper.writeValueAsString(instance);
		return jsonString;
	}
	
	@GET
    @Path("email/{email}")
    public Response getMemberGrade(@DefaultValue("default")  @PathParam("email") String email) {
 
        String output = " This is your email: " + email;
 
        //Just testing another way to return a response
        return Response.status(200).entity(output).build();
	}

	@POST
	@Path("login")
	@Produces(MediaType.TEXT_HTML)
	// can also do TEXT_PLAIN
	public String login(
			@DefaultValue("default username") @QueryParam("username") String username,
			@DefaultValue("default password") @QueryParam("password") String password) {
		System.out.println("Username = " + username + " Password: " + password);
		String name = username;
		return "<p>WELCOME  " + name + "</p><p>  your password is  " + password
				+ "</p>";

	}
}