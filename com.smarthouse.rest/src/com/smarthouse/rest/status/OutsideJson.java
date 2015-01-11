package com.smarthouse.rest.status;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import SmartFunctions.Outside;
//http://Your ip:8080/com.smarthouse.rest/api/outside?name=Fountain&state=true&selected=1
@Path("/outside")
@Produces(MediaType.TEXT_HTML)
public class OutsideJson {
	@GET
	public String outsideJSON(@QueryParam("name") String name,
			@QueryParam("state") boolean state,
			@QueryParam("selected") int selected)
			throws JsonGenerationException, JsonMappingException, IOException {
		Outside outside = new Outside(name, state, selected);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(outside);
	}

}