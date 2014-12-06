package com.smarthouse.rest.status;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Jackson is used for processing JSON
//use this url: http://YOUR_IP:8080/com.smarthouse.rest/api/JSONTest

@Path("/smarthouse")
public class Email {

//	@GET
//	    @Path("{email}/house/{houseNo}")
//	    public Response getMemberGrade(@DefaultValue("default")  @PathParam("email") String email, @QueryParam("houseNo") int houseNo) {
//	 
//	        String output = " This is your email: " + email + " You're house number: "+ houseNo;
//	 
//	        //Just testing another way to return a response
//	        return Response.status(200).entity(output).build();
//	
	
	@GET
    @Path("{email}")
    public Response getMemberGrade(@DefaultValue("default")  @PathParam("email") String email) {
 
        String output = " This is your email: " + email;
 
        //Just testing another way to return a response
        return Response.status(200).entity(output).build();

	
	        
	        
	
	    
	
	}
}
