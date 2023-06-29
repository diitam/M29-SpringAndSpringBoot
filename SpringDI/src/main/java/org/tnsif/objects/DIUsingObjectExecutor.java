package org.tnsif.objects;
import org.springframework.context.support.*;
import org.springframework.context.*;
//Program to demonstrate on dependencies injection in the form of objects
public class DIUsingObjectExecutor {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("object.xml");
		Student s=(Student) a.getBean("s1");
		s.print();

	}

}
