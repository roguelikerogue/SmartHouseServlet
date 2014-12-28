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
import org.codehaus.jettison.json.JSONString;

import SmartFunctions.Alarm;



@Path("/")
public class Resources {

	
	

	
	//Write like this http://localhost:8080/com.smarthouse.rest/api/email/iliketuna@fishlovers.com
	@GET
    @Path("email/{email}")
    public Response getMemberGrade(@DefaultValue("default")  @PathParam("email") String email) {
 
        String output = " This is your email: " + email;
 
        //Just testing another way to return a response
        return Response.status(200).entity(output).build();
	}

	//Type like this http://localhost:8080/com.smarthouse.rest/api/login?username=cameron&password=tuna
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
	@POST
    @Path("test")
	@Produces(MediaType.TEXT_HTML)
	public String TestJson(@QueryParam("name") String name,
			 @QueryParam("state") boolean state, @QueryParam("selected")int selected ){
				return "<p>Name  " + name + "</p><p>  state " + state
				+ "</p><p>selected " + selected+ "</p>";

		
		
	}
	
    
	
}

	 
