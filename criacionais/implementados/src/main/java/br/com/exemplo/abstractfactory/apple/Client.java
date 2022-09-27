package br.com.exemplo.abstractfactory.apple;

import br.com.exemplo.abstractfactory.apple.factory.IPhone11Factory;
import br.com.exemplo.abstractfactory.apple.factory.IPhoneFactory;
import br.com.exemplo.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.exemplo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.exemplo.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhone;
import br.com.exemplo.abstractfactory.apple.model.iphone.IPhoneLevel;


public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		IPhoneFactory xFactory = new IPhoneXFactory(rules);
		IPhoneFactory elevenFactory = new IPhone11Factory(rules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = xFactory.orderIPhone(IPhoneLevel.STANDARD);
		System.out.println(iphoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11 = elevenFactory.orderIPhone(IPhoneLevel.HIGH_END);
		System.out.println(iphone11);
	}
}