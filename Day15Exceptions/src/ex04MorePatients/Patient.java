package ex04MorePatients;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*Write a class that asks for data (name and year of birth) about new patients in a hospital and keeps them in a list
of Patient. The constructor of Patient must throw an IllegalArgumentException if the age of the patient is
negative or greater than 130.*/

// this throws an exception when it shouldn't

public class Patient {

	public int id;
	public String name;
	public int age;
	int size;

	public Patient(int id, String name, int birth) {
		this.id = id;
		this.name = name;
		age = birth;
	}

	ArrayList<Patient> patients = new ArrayList<>();

	public static void main(String[] args) {

		int length = 0;
		String name = "Mary Smith";
		int dateOfB = 1995;

		Patient pat = new Patient(length, name, dateOfB);

		// just goes straight to exception
		pat.newPatient(name, dateOfB);

	}

	// method to build a patient object

	public Patient newPatient(String name, int dob) {

		int thisYear = 2016;
		int ageLimit = 130;

		if (((thisYear - dob) > ageLimit) || (dob > thisYear)) {
			System.out.println("The age is not valid");
			throw new IllegalArgumentException();
		}

		age = thisYear - dob;
		id = size;
		size++;
		Patient x = new Patient(size, name, age);
		System.out.println("The paitent is called " + x.name + " and ID is : " + x.id + " and age is: " + x.age);
		patients.add(x);
		return x;
	}

}








