package com.ivanshestakov.lab2.repository.factory;

import com.ivanshestakov.lab2.repository.ApplianceDAO;
import com.ivanshestakov.lab2.repository.impl.ApplianceDAOImpl;

/**
 * A factory for creating ApplianceDAO.
 */
public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	
	private DAOFactory() {}

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
