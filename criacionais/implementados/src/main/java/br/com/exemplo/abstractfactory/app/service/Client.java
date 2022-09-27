package br.com.exemplo.abstractfactory.app.service;

import br.com.exemplo.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.exemplo.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.exemplo.abstractfactory.app.service.services.CarService;
import br.com.exemplo.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Marvin");
		userService.delete(1);
		
		CarService carService = factory.getCarService();
		carService.save("Honda Civic");
		carService.update("Ford KA");
	}
}