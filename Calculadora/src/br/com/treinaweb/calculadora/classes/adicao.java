package br.com.treinaweb.calculadora.classes;

public class adicao extends CalculoMatematico {

	public adicao(int numero1, int numero2) {
		super(numero1, numero2);
		
	}

	@Override
	protected int doCalcular() {
		return numero1 + numero2;
	}

}
