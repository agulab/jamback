package com.jam.jamback.model;

import java.util.List;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private List<ExternalId> externalIds;
	
	public List<ExternalId> getExternalIds() {
		return externalIds;
	}
	public void setExternalIds(List<ExternalId> externalIds) {
		this.externalIds = externalIds;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
