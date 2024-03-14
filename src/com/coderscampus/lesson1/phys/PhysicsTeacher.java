package com.coderscampus.lesson1.phys;

import com.coderscampus.lesson1.Teacher;

public class PhysicsTeacher extends Teacher{
	
	public PhysicsTeacher () { 
		
		System.out.println("inside the PhysicsTeacher constructor.");
		//can also just type setClasses but
		//using this.setClasses indicates it is part of this constructor 
		this.setClasses("Phys 101, Phys 202");
		this.setLevelOfEducation("MS");
	}	
		//overriding with a method in a child class will completely override the same method in the parent class. 
	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics" );
		
	}

	public void teach (String teachName) {
		System.out.println("I am a physics teacher. My name is " + teachName + " and I teach physics.");
	}

	}
