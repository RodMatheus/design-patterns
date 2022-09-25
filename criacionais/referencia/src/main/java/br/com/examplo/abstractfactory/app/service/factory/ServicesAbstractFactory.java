package br.com.examplo.abstractfactory.app.service.factory;

import br.com.examplo.abstractfactory.app.service.services.CarService;
import br.com.examplo.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
