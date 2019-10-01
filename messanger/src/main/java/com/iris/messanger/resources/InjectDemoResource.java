package com.iris.messanger.resources;

import java.net.URI;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	@GET
	@Path("context")
	public String getContextParamDemo(@Context final UriInfo uriInfo, @Context final HttpHeaders header) {
		final URI absolutePath = uriInfo.getAbsolutePath();
		final Map<String, Cookie> cookies = header.getCookies();
		return "DEMO " + absolutePath.toString() + "  ::" + cookies.toString();
	}

	@GET
	@Path("annotaions")
	public String getParamsUsingAnnotation(@MatrixParam("name") final String name,
			@HeaderParam("head") final String head, @CookieParam("Cookie_1") final String cookie) {
		return "Matrix param ::" + name + " header value ::" + head + "   cookie ::::: " + cookie;
	}
}
