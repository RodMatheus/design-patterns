package br.com.exemplo.factory.apple.complex.factory;

import br.com.exemplo.factory.apple.complex.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone() {
		IPhone device = createIPhone();	
		device.getHardware();
		device.certificates();
		device.assemble();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone();
}