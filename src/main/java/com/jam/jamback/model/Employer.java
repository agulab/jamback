package com.jam.jamback.model;

import java.util.List;

public class Employer extends User {

	private List<Review> reviews;

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
