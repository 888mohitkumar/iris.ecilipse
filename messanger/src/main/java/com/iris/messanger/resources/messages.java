package com.iris.messanger.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.iris.messanger.Exception.DataNotFoundException;
import com.iris.messanger.model.Message;
import com.iris.messanger.service.MessageService;

@Path("/messages")
public class messages {

	MessageService messageService = new MessageService();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(final Message message) {
		return messageService.addMessage(message);
	}

	@Path("{messageId}/comments")
	public Comments getCommentResource() {
		return new Comments();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getMessage(@PathParam("id") final long id, @Context final UriInfo uriInfo) {
		if (messageService.getMessage(id) == null) {
			throw new DataNotFoundException("data not found with id");
		}
		final URI build = uriInfo.getAbsolutePathBuilder().build(id);
		System.out.println(build.toString());
		return Response.created(build).entity(messageService.getMessage(id)).build();
		// return
		// Response.status(Status.CREATED).entity(messageService.getMessage(id)).build();
		// return messageService.getMessage(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("year") final int year, @QueryParam("start") final int start,
			@QueryParam("end") final int end) {
		if (year > 0) {
			return messageService.getAllMessagesForYear(year);
		} else if (start >= 0 && end > 0) {
			return messageService.getAllMessagesPagenated(start, end);
		}
		return messageService.getMessages();
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Message removeMessage(@PathParam("id") final long id) {
		return messageService.removeMessage(id);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message UpdateMessage(final Message message) {
		return messageService.updateMessage(message);
	}
}
