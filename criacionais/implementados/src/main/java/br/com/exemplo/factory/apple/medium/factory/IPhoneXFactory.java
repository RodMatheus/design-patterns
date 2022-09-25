package br.com.exemplo.factory.apple.medium.factory;

import br.com.exemplo.factory.apple.medium.model.IPhone;
import br.com.exemplo.factory.apple.medium.model.IPhoneLevel;
import br.com.exemplo.factory.apple.medium.model.IPhoneX;
import br.com.exemplo.factory.apple.medium.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	protected IPhone createIPhone(final IPhoneLevel level) {
		return switch (level) {
			case STANDARD -> new IPhoneX();
			case HIGH_END -> new IPhoneXSMax();
			default -> null;
		};
	}
}