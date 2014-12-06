package com.smarthouse.rest.status;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.omg.DynamicAny.NameValuePair;

import com.sun.research.ws.wadl.Request;


//Jackson is used for processing JSON
//use this url: http://YOUR_IP:8080/com.smarthouse.rest/api/JSONTest

@Path("/JSONTest")
public class JSONTest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)//try with TEXT_HTML. See if still works.
	public String returnJSON() throws JsonGenerationException, JsonMappingException, IOException{
		
		SmartHouse instance = new SmartHouse();
		String jsonString = null;
		
		//this lets us try modify the address
		//instance.setAddress("321 Real St, Realville");
		ObjectMapper mapper = new ObjectMapper();//thing that makes  json

		jsonString = mapper.writeValueAsString(instance);
		return jsonString;
		
	}
	
}
	
	
	