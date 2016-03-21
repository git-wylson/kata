package fr.wd.kata.business.services;

import java.util.List;

public interface IFoobarqixService {

	/**
	 * This Method return list of FooBarQix
	 * @param maxNumber {@link Integer} an max number to calculate FooBarQix result
	 * @return {@link List<FooBarQix>} list of FooBarQix results
	 */
	List<FooBarQix> calculteNumber(Integer maxNumber);

}
