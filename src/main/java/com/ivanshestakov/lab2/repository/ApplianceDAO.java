package com.ivanshestakov.lab2.repository;

import com.ivanshestakov.lab2.entity.criteria.Criteria;
import com.ivanshestakov.lab2.entity.Appliance;

import java.util.List;

/**
 * Interface for appliance DAOs.
 */
public interface ApplianceDAO {

	/**
	 * Finds appliances that fit certain criteria.
	 * @param criteria a set of criteria
	 * @return list of appliances that fit the criteria
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Saves a list of appliances to a file.
	 * @param appliances list of appliances to save
	 */
	void save(List<Appliance> appliances);

	/**
	 * Gets appliances from file
	 * @return a list of all appliances
	 */
	List<Appliance> parseAll();
}
