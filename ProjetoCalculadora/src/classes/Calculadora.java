package classes;

import java.util.Scanner;

public class Calculadora {

	private float operando1;
	private String operador;
	private float operando2;

	public Calculadora() {
	}

	public void calcula() {
		System.out.println("--------------------------------------------------");
		System.out.println("Calculadora trabalha com os operadores '+' , '-' , '/' , '*' .");
		System.out.println("Novo Calculo iniciado ....");
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro operando : ");
		this.operando1 = ler.nextFloat();
		System.out.println("Digite o operador :");
		this.operador = ler.next();
		System.out.println("Digite o segundo operando : ");
		this.operando2 = ler.nextFloat();
		
		if (operador.equals("/") && operando2 <= 0) {
			System.out.println("Impossivel dividir por zero ou número negativo.");
		} else {
			if (operador.equals("+")) {
				operacaoSoma();
			} else {
				if (operador.equals("-")) {
					operacaoSubtracao();
				} else {
					if (operador.equals("*")) {
						operacaoMultiplicacao();
					} else {
						if (operador.equals("/")) {
							operacaoDivisao();
						}
					}
				}
			}
		}
	

	}

	private void operacaoSoma() {
		System.out.println("--------------------------------------------------");
		System.out.println(
				" Calculo : " + operando1 + " " + operador + " " + operando2 + " = " + (operando1 + operando2));
		System.out.println("--------------------------------------------------");
		System.out.println("**************************************************");
		System.out.println("**************************************************");

		

	}

	private void operacaoSubtracao() {
		System.out.println("--------------------------------------------------");
		System.out.println(
				" Calculo : " + operando1 + " " + operador + " " + operando2 + " = " + (operando1 - operando2));
		System.out.println("--------------------------------------------------");
		System.out.println("**************************************************");
		System.out.println("**************************************************");

	}

	private void operacaoMultiplicacao() {
		System.out.println("--------------------------------------------------");
		System.out.println(
				" Calculo : " + operando1 + " " + operador + " " + operando2 + " = " + (operando1 * operando2));
		System.out.println("--------------------------------------------------");
		System.out.println("**************************************************");
		System.out.println("**************************************************");

	}

	private void operacaoDivisao() {
		System.out.println("--------------------------------------------------");
		System.out.println(
				" Calculo : " + operando1 + " " + operador + " " + operando2 + " = " + (operando1 / operando2));
		System.out.println("--------------------------------------------------");
		System.out.println("**************************************************");
		System.out.println("**************************************************");

	}
}