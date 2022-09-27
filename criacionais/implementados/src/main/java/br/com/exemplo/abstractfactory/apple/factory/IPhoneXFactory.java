package br.com.exemplo.abstractfactory.apple.factory;

import br.com.exemplo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhone;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhoneLevel;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhoneX;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(IPhoneLevel level) {
		return switch (level) {
			case STANDARD -> new IPhoneX(rules);
			case HIGH_END -> new IPhoneXSMax(rules);
			default -> null;
		};
	}
}