package br.com.exemplo.factory.apple.complex.factory;

import br.com.exemplo.factory.apple.complex.model.IPhone;
import br.com.exemplo.factory.apple.complex.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	protected IPhone createIPhone() {
		return new IPhoneX();
	}
}