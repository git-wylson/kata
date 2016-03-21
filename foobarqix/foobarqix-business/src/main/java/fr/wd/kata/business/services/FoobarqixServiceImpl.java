package fr.wd.kata.business.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.wd.kata.business.rules.ValidatorBusinessRules;

@Service
// @Transactional
public class FoobarqixServiceImpl implements IFoobarqixService {

	@Autowired
	private ValidatorBusinessRules validator;

	public List<FooBarQix> calculteNumber(Integer maxNumber) {
		List<FooBarQix> results = new ArrayList<FooBarQix>(maxNumber);

		for (int number = 1; number <= maxNumber; number++) {
			results.add(new FooBarQix(number, validator.calculateNumber(number)));
		}
		return results;
	}

}
