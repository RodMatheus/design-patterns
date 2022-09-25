package br.com.exemplo.factory.apple.simple.factory;

import br.com.exemplo.factory.apple.simple.model.IPhone;
import br.com.exemplo.factory.apple.simple.model.IPhone11;
import br.com.exemplo.factory.apple.simple.model.IPhone11Pro;
import br.com.exemplo.factory.apple.simple.model.IPhoneLevel;
import br.com.exemplo.factory.apple.simple.model.IPhoneX;
import br.com.exemplo.factory.apple.simple.model.IPhoneXSMax;
import br.com.exemplo.factory.apple.simple.model.IPhoneGeneration;

public abstract class IPhoneSimpleFactory {
	
	public static IPhone orderIPhone(final IPhoneGeneration generation, final IPhoneLevel level) {
		IPhone device = createIPhone(generation, level);	

		if(device != null) {
			device.getHardware();
			device.certificates();
			device.assemble();
			device.pack();
		}
		
		return device;
	}

	private static IPhone createIPhoneX(final IPhoneLevel level) {
		return switch(level) {
			case STANDARD -> new IPhoneX();
			case HIGH_END ->  new IPhoneXSMax();
			default -> null;
		};
	}
	
	private static IPhone createIPhone11(final IPhoneLevel level) {
		return switch(level) {
			case STANDARD -> new IPhone11();
			case HIGH_END ->  new IPhone11Pro();
			default -> null;
		};
	}
	
	private static IPhone createIPhone(final IPhoneGeneration generation, final IPhoneLevel level) {
		return switch(generation) {
			case X -> createIPhoneX(level);
			case ELEVEN -> createIPhone11(level);
			default -> null;
		};
	}
}