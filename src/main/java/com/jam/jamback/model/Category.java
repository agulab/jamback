package com.jam.jamback.model;

import java.util.List;

public class Category {

	private String name;
	private List<Worker> workers;
	private List<Tag> tags;
	private ScoreTemplate scoreTemplate;

	public ScoreTemplate getScoreTemplate() {
		return scoreTemplate;
	}

	public void setScoreTemplate(ScoreTemplate scoreTemplate) {
		this.scoreTemplate = scoreTemplate;
	}

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
