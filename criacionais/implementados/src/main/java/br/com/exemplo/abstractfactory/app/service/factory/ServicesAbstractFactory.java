package br.com.exemplo.abstractfactory.app.service.factory;

import br.com.exemplo.abstractfactory.app.service.services.CarService;
import br.com.exemplo.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {
	UserService getUserService();
	CarService getCarService();
}