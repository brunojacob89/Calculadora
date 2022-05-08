package br.com.treinaweb.calculado.fabricas;

import br.com.treinaweb.calculadora.classes.adicao;
import br.com.treinaweb.calculadora.classes.divisao;
import br.com.treinaweb.calculadora.classes.mutiplicacao;
import br.com.treinaweb.calculadora.classes.potenciacao;
import br.com.treinaweb.calculadora.classes.subtracao;
import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public class FarbricaCalculosMatematicos {
	
	public CalculadorMatematico criarcalculador(int numero1, int numero2, String calculo) {
		if (calculo.equals("+")) {
			return new adicao (numero1, numero2);
		} else if (calculo.equals("-")) {
			return new subtracao(numero1, numero2);
		} else if (calculo.equals("*")) {
			return new mutiplicacao (numero1, numero2);
		} else if (calculo.equals("/")) {
			return new divisao (numero1 , numero2);
		}else if (calculo.equals("^")) {
			return new potenciacao (numero1, numero2);
		}else {
			return null;
		}
		
	}

}
