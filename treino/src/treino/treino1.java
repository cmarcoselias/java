package treino;

import java.util.Scanner;

public class treino1 {
	public static void main(String[] args) {
		String  opcao;
		double n1, n2 ;
		Scanner ler = new Scanner(System.in);
		System.out.println("escolha a operação abaixo");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		opcao = ler.nextLine();
		System.out.println("digite dois valores");
		n1 = ler.nextDouble();
		n2 = ler.nextDouble();
		switch (opcao) {
		case "+":
			System.out.println(n1 + n2);
			break;
		case"-":
			System.out.println(n1 - n2);
			break;
		case "*":
			System.out.println(n1 * n2);
			break;
		case"/":
			if (n2 ==0) {
			System.err.println("resultado da divisão invalida");
			return;
			}else{
			System.out.println(n1/n2);
			break;
			}
			default:
				System.out.println("operadores invalidos");
			
		}
	
	} 
}

