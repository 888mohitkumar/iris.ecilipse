package com.iris.messanger.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.iris.messanger.model.ErrorMessage;

@Provider
public class MyExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(final DataNotFoundException arg0) {
		final ErrorMessage errorMessage = new ErrorMessage("Record not found", 404, "https://localhiost");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
		// return null;
	}

}
