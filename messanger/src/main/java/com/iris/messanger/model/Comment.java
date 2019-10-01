package com.iris.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment {

	private long id;

	private String message;
	private Date created;
	private String author;

	public Comment() {

	}

	public Comment(final long id, final String message, final Date created, final String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		this.author = author;
	}

	public String getAuthor() {
		return author;
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
