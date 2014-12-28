package com.smarthouse.rest.status;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import SmartFunctions.Devices;
import SmartFunctions.Rooms;

//http://Your ip:8080/com.smarthouse.rest/api/outside?roomDevices=DoorAlarm&state=true&selected=1
	@Path("/roomsDevices")
	@Produces(MediaType.TEXT_HTML)
	public class RoomsJSON {
		@GET
		public String alarmsJSON(@QueryParam("name") String name,
				@QueryParam("devices")ArrayList<Devices> devices,
				@QueryParam("selected") int selected)
				throws JsonGenerationException, JsonMappingException,
				IOException {
			// Rooms room = new Rooms(name,devices,selected);
			
			Rooms room = new Rooms(name, devices, selected);
			room.setDevices(devices);
			room.setName(name);
			room.setSelected(selected);
			ObjectMapper mapper = new ObjectMapper();// thing that makes json
			return mapper.writeValueAsString(room);
		}
	}

