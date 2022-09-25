package br.com.exemplo.abstractfactory.apple.factory.abstractFactory;

import br.com.exemplo.abstractfactory.apple.model.certificate.Certificate;
import br.com.exemplo.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
