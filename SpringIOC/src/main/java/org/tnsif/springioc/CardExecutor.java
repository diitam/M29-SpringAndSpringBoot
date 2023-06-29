package org.tnsif.springioc;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.*;
//Driver Class
public class CardExecutor {

	public static void main(String[] args) {
		
		//Hard-Coding
		/*
		SBICard s=new SBICard();
		HDFCCard h=new HDFCCard();
		s.deposit();
		s.withdraw();
		h.deposit();
		h.withdraw();
		*/
		
		//Spring IOC
		BeanFactory b=new ClassPathXmlApplicationContext("beans.xml");
		/*SBICard s=(SBICard) b.getBean("sbi");
		s.deposit();
		s.withdraw();
		HDFCCard h=(HDFCCard) b.getBean("hdfc");
		h.deposit();
		h.withdraw();*/
		
		
		DebitCard s1=(DebitCard) b.getBean("hdfc");
		s1.deposit();
		s1.withdraw();
	}

}
