package br.com.exemplo.abstractfactory.apple.model.packing;

public class BrazilianPacking implements Packing {

	public String pack() {
		return "\t- Empacotando em Portugues";
	}
}