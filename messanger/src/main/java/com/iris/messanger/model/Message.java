package com.iris.messanger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {

	private long id;

	private String message;
	private Date created;
	private String author;

	private Map<Long, Comment> comments = new HashMap<>();

	public Message() {

	}

	public Message(final long id, final String message, final Date created, final String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@XmlTransient // here comment list will be ignored.
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public Date getCreated() {
		return created;
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public void setComments(final Map<Long, Comment> comments) {
		this.comments = comments;
	}

	public void setCreated(final Date created) {
		this.created = created;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

}
