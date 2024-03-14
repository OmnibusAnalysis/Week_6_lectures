package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compsci.CompSciTeacher;
import com.coderscampus.lesson1.phys.PhysicsTeacher;
import com.coderscampus.lesson1.qphy.QuantumPhysicsTeacher;

public class Lesson1Application {

	//access modifiers in Java are public, private, protected, and packaged
	
	// protected referes to types of inheritence  
	
	public static void main(String[] args) {
		
		PackageAccessModifierExample example = new PackageAccessModifierExample(); 
		System.out.println(example.someValue); 
		System.out.println("-----");

		Teacher physicsTeacher = new PhysicsTeacher();
	
		//This is an alternative wya of casting ub titws more verbose:
		//PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher; 
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		((PhysicsTeacher)physicsTeacher).teach("Casey Michael");
		((PhysicsTeacher)physicsTeacher).markPapers();
		// could also re- declare above as:
		// PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;\
		// castedPhysicsTeacher would never be a variable name 
		System.out.println("-----");

		CompSciTeacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach(40);
		System.out.println("-----");

		QuantumPhysicsTeacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
		quantumTeacher.teach("Casey", 40); 
		System.out.println("-----");
	}

}

//overloading taking the same method but adding an arugment. 