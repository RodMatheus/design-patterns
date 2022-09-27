package br.com.exemplo.abstractfactory.apple.factory;

import br.com.exemplo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhone;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhone11;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhone11Pro;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhoneLevel;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(IPhoneLevel level) {
		return switch (level) {
			case STANDARD -> new IPhone11(rules);
			case HIGH_END -> new IPhone11Pro(rules);
			default -> null;
		};
	}
}