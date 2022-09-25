package br.com.exemplo.factory.apple.simple;

import br.com.exemplo.factory.apple.simple.model.IPhone;
import br.com.exemplo.factory.apple.simple.model.IPhoneLevel;
import br.com.exemplo.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.exemplo.factory.apple.simple.model.IPhoneGeneration;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = IPhoneSimpleFactory.orderIPhone(IPhoneGeneration.X, IPhoneLevel.STANDARD);
		System.out.println(iphoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11 = IPhoneSimpleFactory.orderIPhone(IPhoneGeneration.ELEVEN, IPhoneLevel.HIGH_END);
		System.out.println(iphone11);
	}
}