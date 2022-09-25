package br.com.exemplo.factory.apple.medium.factory;

import br.com.exemplo.factory.apple.medium.model.IPhone;
import br.com.exemplo.factory.apple.medium.model.IPhoneLevel;

public abstract class IPhoneFactory {
	public IPhone orderIPhone(final IPhoneLevel level) {
		IPhone device = createIPhone(level);	
		device.getHardware();
		device.certificates();
		device.assemble();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(final IPhoneLevel level);
}