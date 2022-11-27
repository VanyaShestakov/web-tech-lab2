package com.ivanshestakov.lab2.runner;

import com.ivanshestakov.lab2.entity.criteria.Criteria;
import com.ivanshestakov.lab2.entity.criteria.SearchCriteria;
import com.ivanshestakov.lab2.service.ApplianceService;
import com.ivanshestakov.lab2.service.factory.ServiceFactory;
import com.ivanshestakov.lab2.entity.Appliance;

import java.util.Comparator;
import java.util.List;

public class Runner {


	public static void main(String[] args) {

		final var factory = ServiceFactory.getInstance();
		final var service = factory.getApplianceService();
        
		final var kettleCriteria = new Criteria(SearchCriteria.Kettle.class.getSimpleName());
        var appliances = service.find(kettleCriteria);
		appliances.forEach(System.out::println);

		final var ovenCriteria = new Criteria(SearchCriteria.Oven.class.getSimpleName());
		ovenCriteria.add("powerConsumption", 300);
		final var ovens = service.find(ovenCriteria);
		ovens.forEach(System.out::println);

		appliances = service.getMin(Comparator.comparing(Appliance::getPrice));
		System.out.println("Appliances with minimal price: ");
		appliances.forEach(System.out::println);
	}

}
