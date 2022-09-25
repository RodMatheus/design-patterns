package br.com.exemplo.factory.apple.complex.factory;

import br.com.exemplo.factory.apple.complex.model.IPhone;
import br.com.exemplo.factory.apple.complex.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	protected IPhone createIPhone() {
		return new IPhone11();
	}
}