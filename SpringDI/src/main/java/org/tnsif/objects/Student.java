package org.tnsif.objects;
//Program to demonstrate on DI in the form of object
public class Student {

	//DI in form of objects
	Address address;
	
	//achieving using constructor
	public Student(Address address) {
		super();
		this.address = address;
	}
	
	public void print()
	{
		//we are calling display() method of address class here
		address.display();
	}
	
	
}
