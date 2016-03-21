package fr.wd.kata.business.rules;

import org.springframework.stereotype.Component;

import fr.wd.kata.business.domain.type.EnumFooBarQix;

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
	public String calculateNumber(Integer value) {
		StringBuilder builder = new StringBuilder();
		if (value != null && value > 0) {

			for (EnumFooBarQix enumFooBarQix : EnumFooBarQix.values()) {
				ruleMultiple(builder, value, enumFooBarQix);
			}

			String svalue = value.toString();

			for (int index = 0; index < svalue.length(); index++) {

				char posx = svalue.charAt(index);

				for (EnumFooBarQix enumFooBarQix : EnumFooBarQix.values()) {
					rulePosition(builder, posx, index, enumFooBarQix);
				}
			}

			if (builder.length() == 0) {
				builder.append(value);
			}
		}
		return builder.toString();
	}

	private void ruleMultiple(StringBuilder builder, Integer value, EnumFooBarQix enumFooBarQix) {
		if (value % enumFooBarQix.getMultiple() == 0) {
			builder.append(enumFooBarQix.getValue());
		}
	}

	private void rulePosition(StringBuilder builder, char posx, Integer index, EnumFooBarQix enumFooBarQix) {
		if (posx == enumFooBarQix.getPosition()) {
			builder.append(enumFooBarQix.getValue());
		}
	}

}
