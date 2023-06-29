package org.tnsif.literals;
import org.springframework.context.support.*;
import org.springframework.context.*;
//Program to demonstrate on DI in the form of literals
//Driver class
public class DIUsingLiteralsExecutor {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("literal.xml");
		Employee e=(Employee) a.getBean("e1");
		e.print();
	}

}
