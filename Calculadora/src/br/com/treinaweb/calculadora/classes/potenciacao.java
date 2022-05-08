package br.com.treinaweb.calculadora.classes;

public class potenciacao extends CalculoMatematico {

	public potenciacao(int numero1, int numero2) {
		super(numero1, numero2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int doCalcular() {
		return (int) Math.pow(numero1, numero2);

}
}