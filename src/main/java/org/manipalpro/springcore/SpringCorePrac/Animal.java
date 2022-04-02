package org.manipalpro.springcore.SpringCorePrac;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal {
	public void Hobby() {
	BeanFactory factory=new ClassPathXmlApplicationContext("\\org\\manipalpro\\springcore\\SpringCorePrac\\application-context.xml");
		Test bean=(Test) factory.getBean("t");
		bean.eat();
		bean.sleep();
	}
	public static void main(String[] args) {
		new Animal().Hobby();
	}

}
