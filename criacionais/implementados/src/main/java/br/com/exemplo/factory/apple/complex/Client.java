package br.com.exemplo.factory.apple.complex;

import br.com.exemplo.factory.apple.complex.factory.IPhone11ProFactory;
import br.com.exemplo.factory.apple.complex.factory.IPhoneFactory;
import br.com.exemplo.factory.apple.complex.factory.IPhoneXFactory;
import br.com.exemplo.factory.apple.complex.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = iphoneXFactory.orderIPhone();
		System.out.println(iphoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone11);
	}
}