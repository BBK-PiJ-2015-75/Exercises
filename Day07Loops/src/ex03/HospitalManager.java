package ex03;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

//hospital manager adds patient objects to a list

public class HospitalManager {

	private static Patient patientListStart = null;
	static LinkedList<Patient> list;
	private static Patient next = null;
	public static int size = 0;
	
	
	public static void main(String[] args) {
		
		HospitalManager hm = new HospitalManager();	
		hm.launch();
		
		addPatient("Ahmed1", 35, "Cold");
		addPatient("Ahmed2", 35, "Cold");
		addPatient("Ahmed3", 35, "Cold");
		addPatient("John1", 35, "Cold");
		addPatient("John2", 35, "Cold");
		addPatient("John3", 35, "Cold");
		addPatient("Ann1", 35, "Cold");
		addPatient("Ann2", 35, "Cold");
		addPatient("Ann3", 35, "Cold");
		addPatient("Ann4", 35, "Cold");
		System.out.println(hm.list.size());
		System.out.println(list.get(2).toString());
		calculateSize(list);
	}
	
	// initialise the list, add the first patient, point PLS pointer to first patient
	public void launch(){
		
		list = new LinkedList<>();
		Patient firstPatient = new Patient ("John", 70, "Flu");
		patientListStart = firstPatient;
		list.add(firstPatient);
		size++;
		
		//System.out.println(list.size());
	}
	
	// public Patient(String name, int age, String illness)
	public static void addPatient(String name, int age, String illness){
		Patient patientName = new Patient (name, age, illness);
		list.add(patientName);
		size++;
		
		
		}
	
	public static int calculateSize(LinkedList list) {

		int size = 0;
		Patient current;

		if (!(patientListStart != null)) {
			size = 0;
		}

		while (next != null) {
			current = next;
			size++;
		}
		System.out.println(size);
		return size;
	}
	
}
	

		
		
		
		
		



