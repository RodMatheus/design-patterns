package br.com.exemplo.factory.apple.medium;


import br.com.exemplo.factory.apple.medium.factory.IPhone11Factory;
import br.com.exemplo.factory.apple.medium.factory.IPhoneFactory;
import br.com.exemplo.factory.apple.medium.factory.IPhoneXFactory;
import br.com.exemplo.factory.apple.medium.model.IPhone;
import br.com.exemplo.factory.apple.medium.model.IPhoneLevel;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = iphoneXFactory.orderIPhone(IPhoneLevel.STANDARD);
		System.out.println(iphoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11 = iphone11Factory.orderIPhone(IPhoneLevel.HIGH_END);
		System.out.println(iphone11);
	}
}