package fr.wd.kata.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wd.kata.business.services.FooBarQix;
import fr.wd.kata.business.services.FoobarqixServiceImpl;
import fr.wd.kata.business.services.IFoobarqixService;

public class AppConsole {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "business-autoscan.xml" });

		IFoobarqixService foo = (FoobarqixServiceImpl) context.getBean("foobarqixServiceImpl");

		List<FooBarQix> results = foo.calculteNumber(100);
		for (FooBarQix fbq : results) {
			System.out.println(fbq.toString());
		}
	}
}
