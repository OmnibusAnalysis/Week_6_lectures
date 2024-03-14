package com.coderscampus.lesson1.qphy;

import com.coderscampus.lesson1.phys.PhysicsTeacher;

public class QuantumPhysicsTeacher extends PhysicsTeacher{

	public QuantumPhysicsTeacher () {
		System.out.println("inside the QuantumPhysicsTeacher constructor.");
		this.setClasses("QUPY 101, QUPY 202");
		this.setLevelOfEducation("PhD");
		
	}
	
		public void teach () {
			System.out.println("I'm a Quantum Physics teacher and I'm taking leaps.");
			

	}
	
}
