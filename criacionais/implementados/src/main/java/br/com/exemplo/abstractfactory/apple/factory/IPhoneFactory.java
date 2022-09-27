package br.com.exemplo.abstractfactory.apple.factory;

import br.com.exemplo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhone;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhoneLevel;

public abstract class IPhoneFactory {
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIPhone(IPhoneLevel level) {
		IPhone device = createIPhone(level);
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(IPhoneLevel level);
}