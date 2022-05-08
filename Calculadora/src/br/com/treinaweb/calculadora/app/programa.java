package br.com.treinaweb.calculadora.app;

import br.com.treinaweb.calculado.fabricas.FarbricaCalculosMatematicos;
import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public class programa {

	public static void main(String[] args) {
		
		String calculo = "^";
		int numero1 = 4;
		int numero2 = 2;
		FarbricaCalculosMatematicos fabrica = new FarbricaCalculosMatematicos ();
		CalculadorMatematico Calculador = fabrica.criarcalculador(numero1, numero2, calculo);
		if (Calculador != null) {
			System.out.println(Calculador.calcular());
		} else {
			System.out.println("Calculo invalido");
		}
		
		FarbricaCalculosMatematicos farbrica2 = new FarbricaCalculosMatematicos();
		CalculadorMatematico criarcalculador = farbrica2.criarcalculador(20, 2, "/");
		int calcular = criarcalculador.calcular();
		System.out.println(calcular);

	}

}
