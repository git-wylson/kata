package fr.wd.kata.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wd.kata.business.domain.FooBarQix;
import fr.wd.kata.business.services.FoobarqixServiceImpl;
import fr.wd.kata.business.services.IFoobarqixService;

/**
 * Main console test.
 * @author wylson dibinga
 */
public class AppConsole {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// We get the spring context for application.
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "business-autoscan.xml" });

		// We define our Business service interface which contains the foobarqix method.
		IFoobarqixService foo = (FoobarqixServiceImpl) context.getBean("foobarqixServiceImpl");

		// We calculte and print numbers from 1 to 100
		List<FooBarQix> results = foo.calculteNumber(100);
		for (FooBarQix fbq : results) {
			System.out.println(fbq.toString());
		}
	}
}
