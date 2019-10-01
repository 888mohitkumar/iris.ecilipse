package com.iris.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private long id;
	private String firstName;
	private String lastName;
	private Date created;

	public Profile() {

	}

	public Profile(final long id, final String firstName, final String lastName, final Date created) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
	}

	public Date getCreated() {
		return created;
	}

	public String getFirstName() {
		return firstName;
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCreated(final Date created) {
		this.created = created;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
}
