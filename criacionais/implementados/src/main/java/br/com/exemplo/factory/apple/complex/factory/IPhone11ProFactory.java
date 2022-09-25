package br.com.exemplo.factory.apple.complex.factory;

import br.com.exemplo.factory.apple.complex.model.IPhone;
import br.com.exemplo.factory.apple.complex.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	protected IPhone createIPhone() {
		return new IPhone11Pro();
	}
}