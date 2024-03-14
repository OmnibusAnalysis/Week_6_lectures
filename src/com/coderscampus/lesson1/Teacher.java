package com.coderscampus.lesson1;

public class Teacher {

	private String classes;
	private String levelOfEducation;
	protected int totalNumberOfMarkedPapers;

	protected void markPapers() {
		System.out.println("I'm a teacher and I am grading papers.");
	}

	private void getARaise() {
		System.out.println("Techer gets a raise.");
	}

	public void teach() {
		System.out.println("I'm a teacher and I am teaching");
	}

	public void teach(int age) {
		System.out.println("I'm a " + age + " old teacher and I'm teaching physics.");
	}

	public void teach(String teachName, int age) {
		System.out.println("I am a " + age + " old teacher named " + teachName + " and Teaching myself");
	}

	public Teacher() {
		System.out.println("inside the Teacher constructor.");
		this.classes = "No classes assigned.";
		this.levelOfEducation = "No education.";
		this.getARaise(); 
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}

}
