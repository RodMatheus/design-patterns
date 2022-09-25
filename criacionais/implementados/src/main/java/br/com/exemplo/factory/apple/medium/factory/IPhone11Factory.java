package br.com.exemplo.factory.apple.medium.factory;

import br.com.exemplo.factory.apple.medium.model.IPhone;
import br.com.exemplo.factory.apple.medium.model.IPhone11;
import br.com.exemplo.factory.apple.medium.model.IPhone11Pro;
import br.com.exemplo.factory.apple.medium.model.IPhoneLevel;

public class IPhone11Factory extends IPhoneFactory {

	protected IPhone createIPhone(final IPhoneLevel level) {
		return switch (level) {
			case STANDARD -> new IPhone11();
			case HIGH_END -> new IPhone11Pro();
			default -> null;
		};
	}
}