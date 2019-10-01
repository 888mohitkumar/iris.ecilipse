package com.iris.messanger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class Comments {

	@GET
	public String test(@PathParam("messageId") final int messageId) {
		return "test comments ::" + messageId;
	}
}
