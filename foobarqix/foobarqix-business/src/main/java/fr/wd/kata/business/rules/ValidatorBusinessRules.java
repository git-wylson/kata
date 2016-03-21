package fr.wd.kata.business.rules;

import org.springframework.stereotype.Component;

/**
 * This class calculates FooBarQix algorithm below. This is the subject :<br>
 * if the number is divisible by 3 or contains 3, replace 3 by "Foo";<br>
 * if the number is divisible by 5 or contains 5, replace 5 by "Bar";<br>
 * if the number is devisible by 7 or contains 7, replace 7 by "Qix".<br>
 * Example: 1 2 FooFoo 4 BarBar Foo QixQix 8 Foo Bar<br>
 * <br>
 * More details:<br>
 * <br>
 * divisors have high precedence, ex: 51 -> FooBar<br>
 * the content is analysed in the order they appear, ex: 53 -> BarFoo<br>
 * 13 contains 3 so we print "Foo"<br>
 * 15 is divisible by 3 and 5 and contains 5, so we print “FooBarBar”<br>
 * 33 contains 3 two times and is divisible by 3, so we print “FooFooFoo”<br>
 * @author wylson dibinga wd
 */
@Component
public class ValidatorBusinessRules {

	public ValidatorBusinessRules() {
	}

	/**
	 * The method to calculate FooBarQix algorithm
	 * @param number : {@link Integer} an integer
	 * @return {@link String} result value
	 */
	public String calculateNumber(Integer number) {
		StringBuilder builder = new StringBuilder();
		// First of all we test if the number is divisible by 3 or 5 or 7
		if (number != null && number > 0) {
			if (number % 3 == 0) {
				builder.append("Foo");
			}

			if (number % 5 == 0) {
				builder.append("Bar");
			}

			if (number % 7 == 0) {
				builder.append("Qix");
			}

			// We test if the number contains 3 or 5 or 7
			String svalue = number.toString();
			for (int index = 0; index < svalue.length(); index++) {
				char posx = svalue.charAt(index);

				if (posx == '3') {
					builder.append("Foo");
				}

				if (posx == '5') {
					builder.append("Bar");
				}

				if (posx == '7') {
					builder.append("Qix");
				}
			}

			if (builder.length() == 0) {
				builder.append(number);
			}
		}
		return builder.toString();
	}

}
