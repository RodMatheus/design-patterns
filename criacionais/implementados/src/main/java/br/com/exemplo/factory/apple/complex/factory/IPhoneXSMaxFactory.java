package br.com.exemplo.factory.apple.complex.factory;

import br.com.exemplo.factory.apple.complex.model.IPhone;
import br.com.exemplo.factory.apple.complex.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	protected IPhone createIPhone() {
		return new IPhoneXSMax();
	}
}